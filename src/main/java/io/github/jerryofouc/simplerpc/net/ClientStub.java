package io.github.jerryofouc.simplerpc.net;

import com.google.protobuf.ByteString;
import io.github.jerryofouc.simplerpc.client.channel.ClientChannelInitializer;
import io.github.jerryofouc.simplerpc.protobuf.SimpleRPC;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by xiaojiez on 4/19/17.
 */
public class ClientStub {
    private InetSocketAddress serverAddress;
    private Channel clientChannel;
    private AtomicLong serialNum = new AtomicLong(0);
    private Map<Long,Lock> lockMap = new HashMap<Long, Lock>();
    private Map<Long,Condition> conditionMap = new HashMap<Long, Condition>();
    private Map<Long,SimpleRPC.RPCResponse> resultMap = new ConcurrentHashMap<Long, SimpleRPC.RPCResponse>();

    public ClientStub(InetSocketAddress serverAddress) throws InterruptedException {
        this.serverAddress = serverAddress;
        startClient();
    }



    private void startClient() throws InterruptedException {
        new Thread(new Runnable() {
            public void run() {
                // Configure the client.
                EventLoopGroup group = new NioEventLoopGroup();
                try {
                    Bootstrap b = new Bootstrap();
                    b.group(group)
                            .channel(NioSocketChannel.class)
                            .option(ChannelOption.TCP_NODELAY, true)
                            .handler(new ClientChannelInitializer(ClientStub.this));

                    // Start the client.
                    ChannelFuture f = b.connect(ClientStub.this.serverAddress).sync();
                    clientChannel = f.channel();
                    // Wait until the connection is closed.
                    f.channel().closeFuture().sync();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // Shut down the event loop to terminate all threads.
                    group.shutdownGracefully();
                }
            }
        }).start();

    }

    public SimpleRPC.RPCResponse invoke(String methodName,byte[] params) throws InterruptedException {
        long cur = serialNum.addAndGet(1);
        clientChannel.writeAndFlush(SimpleRPC.RPCRequest.newBuilder()
                .setMethodName(methodName).setSerialNum(cur).setRequestParams(ByteString.copyFrom(params)).build());
        Lock lock = new ReentrantLock();
        lockMap.put(cur,lock);
        Condition arrivalCondition = lock.newCondition();
        conditionMap.put(cur,arrivalCondition);
        try{
            lock.lock();
            while (resultMap.get(cur) == null){
                arrivalCondition.wait();
            }
        }finally {
            lock.unlock();
        }
        return resultMap.get(cur);
    }

    public void notify(SimpleRPC.RPCResponse msg){
        Lock lock = lockMap.get(msg.getSerialNum());
        Condition condition = conditionMap.get(msg.getSerialNum());
        try {
            lock.lock();
            resultMap.put(msg.getSerialNum(),msg);
            condition.signalAll();
        }finally {
            lock.unlock();
            lockMap.remove(msg.getSerialNum());
            conditionMap.remove(msg.getSerialNum());
        }
    }



}
