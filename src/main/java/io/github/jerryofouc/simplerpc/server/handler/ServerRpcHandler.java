package io.github.jerryofouc.simplerpc.server.handler;

import com.google.protobuf.InvalidProtocolBufferException;
import io.github.jerryofouc.simplerpc.protobuf.SimpleRPC;
import io.github.jerryofouc.simplerpc.server.RpcExecutor;
import io.github.jerryofouc.simplerpc.server.stub.ServerStub;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by xiaojiez on 4/18/17.
 */
public class ServerRpcHandler extends SimpleChannelInboundHandler<SimpleRPC.RPCRequest> {
    protected void channelRead0(final ChannelHandlerContext ctx, final SimpleRPC.RPCRequest rpcRequest) throws Exception {
        RpcExecutor.getInstance().executor(new Runnable() {
            public void run() {
                try {
                    SimpleRPC.RPCResponse rpcResponse = ServerStub.getInstance().invoke(rpcRequest);
                    ctx.pipeline().writeAndFlush(rpcResponse);
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
