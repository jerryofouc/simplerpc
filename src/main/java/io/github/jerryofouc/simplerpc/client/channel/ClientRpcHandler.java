package io.github.jerryofouc.simplerpc.client.channel;

import io.github.jerryofouc.simplerpc.net.ClientStub;
import io.github.jerryofouc.simplerpc.protobuf.SimpleRPC;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by xiaojiez on 4/19/17.
 */
public class ClientRpcHandler extends SimpleChannelInboundHandler<SimpleRPC.RPCResponse> {
    private ClientStub clientStub;
    public ClientRpcHandler( ClientStub clientStub){
        this.clientStub = clientStub;
    }
    protected void channelRead0(ChannelHandlerContext ctx, SimpleRPC.RPCResponse msg) throws Exception {
        clientStub.notify(msg);
    }
}
