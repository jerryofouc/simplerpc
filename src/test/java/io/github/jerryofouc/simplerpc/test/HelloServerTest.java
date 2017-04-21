package io.github.jerryofouc.simplerpc.test;

import io.github.jerryofouc.simplerpc.server.RpcServer;
import io.github.jerryofouc.simplerpc.server.stub.ServerStub;

import java.net.InetSocketAddress;

/**
 * Created by xiaojiez on 4/20/17.
 */
public class HelloServerTest {
    public static void main(String[] args) throws InterruptedException {
        RpcServer rpcServer = new RpcServer();
        HelloWorldService helloWorldService = new HelloWorldService();
        ServerStub.getInstance().setService(helloWorldService);
        rpcServer.startServer(new InetSocketAddress(10900));
    }
}
