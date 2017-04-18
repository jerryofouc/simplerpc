package io.github.jerryofouc.simplerpc.server.handler;

import io.github.jerryofouc.simplerpc.protobuf.SimpleRPC;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

/**
 * Created by xiaojiez on 4/18/17.
 */
public class RpcServerInitializer extends ChannelInitializer<SocketChannel> {

    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline().addLast("frameDecoder",new LengthFieldBasedFrameDecoder(1048576, 0, 4, 0, 4));
        ch.pipeline().addLast("protobufDecoder",new  ProtobufDecoder(SimpleRPC.RPCRequest.getDefaultInstance()));
        ch.pipeline().addLast("frameEncoder", new LengthFieldPrepender(4));
        ch.pipeline().addLast("protobufEncoder", new ProtobufEncoder());
        ch.pipeline().addLast("rpcDecoder",new RpcHandler());
    }
}
