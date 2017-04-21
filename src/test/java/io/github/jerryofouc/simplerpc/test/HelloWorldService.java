package io.github.jerryofouc.simplerpc.test;


import com.google.protobuf.InvalidProtocolBufferException;
import io.github.jerryofouc.simplerpc.helloworld.HelloWorld;
import io.github.jerryofouc.simplerpc.server.Service;
import io.github.jerryofouc.simplerpc.server.ServiceMethod;

/**
 * Created by xiaojiez on 4/20/17.
 */
public class HelloWorldService extends Service {
    @ServiceMethod
    public byte[] helloworld(byte[] requestBytes) throws InvalidProtocolBufferException {
        HelloWorld.HelloWorldRequest helloWorldRequest = HelloWorld.HelloWorldRequest.parseFrom(requestBytes);
        return HelloWorld.RPCResponse.newBuilder().setPong(helloWorldRequest.getPing()+"Pong").setResponseCode(0).build().toByteArray();
    }
}
