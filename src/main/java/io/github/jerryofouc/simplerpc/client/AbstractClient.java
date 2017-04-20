package io.github.jerryofouc.simplerpc.client;

import java.net.InetSocketAddress;

/**
 * Created by xiaojiez on 4/18/17.
 */
public abstract class AbstractClient {
    private InetSocketAddress serverAddress;

    public AbstractClient(InetSocketAddress serverAddress) {
        this.serverAddress = serverAddress;
    }


}
