package io.github.jerryofouc.simplerpc.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xiaojiez on 4/18/17.
 */
public class RpcExecutor {
    private static RpcExecutor rpcExecutor;

    private RpcExecutor() {
    }

    public static RpcExecutor getInstance(){
        if(rpcExecutor != null){
            return rpcExecutor;
        }
        synchronized (RpcExecutor.class){
            if(rpcExecutor != null){
                return rpcExecutor;
            }
            rpcExecutor = new RpcExecutor();
        }
        return rpcExecutor;
    }

    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void executor(Runnable callBackTask){
        executorService.submit(callBackTask);
    }

}
