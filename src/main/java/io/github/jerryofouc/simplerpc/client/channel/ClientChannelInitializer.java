package io.github.jerryofouc.simplerpc.client.channel;


import io.github.jerryofouc.simplerpc.net.ClientStub;
import io.github.jerryofouc.simplerpc.protobuf.SimpleRPC;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;

/**
 * Created by xiaojiez on 4/19/17.
 */
public class ClientChannelInitializer extends ChannelInitializer<SocketChannel> {
    private ClientStub clientStub;

    public ClientChannelInitializer(ClientStub clientStub) {
        this.clientStub = clientStub;
    }

    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline().addLast("frameDecoder",new LengthFieldBasedFrameDecoder(1048576, 0, 4, 0, 4));
        ch.pipeline().addLast("protobufDecoder",new ProtobufDecoder(SimpleRPC.RPCResponse.getDefaultInstance()));
        ch.pipeline().addLast("frameEncoder", new LengthFieldPrepender(4));
        ch.pipeline().addLast("protobufEncoder", new ProtobufEncoder());
        ch.pipeline().addLast("rpcDecoder",new ClientRpcHandler(clientStub));
    }
}
