package io.github.jerryofouc.simplerpc.test;

import com.google.protobuf.InvalidProtocolBufferException;
import io.github.jerryofouc.simplerpc.helloworld.HelloWorld;
import io.github.jerryofouc.simplerpc.net.ClientStub;
import io.github.jerryofouc.simplerpc.protobuf.SimpleRPC;

import java.net.InetSocketAddress;

/**
 * Created by xiaojiez on 4/20/17.
 */
public class HelloTestClient {
    public static void main(String[] args) throws InterruptedException, InvalidProtocolBufferException {
        ClientStub clientStub = new ClientStub(new InetSocketAddress(18080));
        SimpleRPC.RPCResponse rpcResponse =
                clientStub.invoke("helloworld", HelloWorld.HelloWorldRequest.newBuilder().setPing("Ping").build().toByteArray());
        SimpleRPC.RPCResponse response = SimpleRPC.RPCResponse.parseFrom(rpcResponse.getResponseData());
        System.out.println(response);
    }
}
