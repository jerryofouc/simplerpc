package io.github.jerryofouc.simplerpc.server.stub;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import io.github.jerryofouc.simplerpc.protobuf.SimpleRPC;
import io.github.jerryofouc.simplerpc.server.Service;
import io.github.jerryofouc.simplerpc.server.ServiceMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by xiaojiez on 4/18/17.
 */
public class ServerStub {
    private static  ServerStub instance;
    private Service service;
    private Map<String,Method> methodMap = new HashMap<String, Method>();

    private ServerStub(){
    }


    public static ServerStub getInstance(){
        if(instance != null){
            return instance;
        }
        synchronized (ServerStub.class){
            if(instance != null){
                return instance;
            }
            instance = new ServerStub();
        }
        return instance;
    }


    public void setService(Service service) {
        this.service = service;
        final List<Method> allMethods = new ArrayList<Method>(Arrays.asList(service.getClass().getDeclaredMethods()));
        for(Method method : allMethods){
            if(method.isAnnotationPresent(ServiceMethod.class)){
                methodMap.put(method.getName(),method);
            }
        }
    }


    public SimpleRPC.RPCResponse invoke(SimpleRPC.RPCRequest rpcRequest) throws InvocationTargetException, IllegalAccessException, InvalidProtocolBufferException {
        if(service == null){
            throw new NullPointerException("service class should be initialize");
        }
        Method method = methodMap.get(rpcRequest.getMethodName());
        byte[] result = (byte[]) method.invoke(service,rpcRequest.getRequestParams().toByteArray());
        return SimpleRPC.RPCResponse.newBuilder().
                setResponseData(ByteString.copyFrom(result))
                .setSerialNum(rpcRequest.getSerialNum()).build();
    }
}