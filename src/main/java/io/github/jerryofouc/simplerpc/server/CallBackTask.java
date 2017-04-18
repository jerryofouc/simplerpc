package io.github.jerryofouc.simplerpc.server;

/**
 * Created by xiaojiez on 4/18/17.
 */
public class CallBackTask implements Runnable {
    private Runnable task;
    private CallBack callBack;

    public CallBackTask(Runnable task, CallBack callBack) {
        this.task = task;
        this.callBack = callBack;
    }

    public void run() {
        this.task.run();
        this.callBack.complete();
    }
}
