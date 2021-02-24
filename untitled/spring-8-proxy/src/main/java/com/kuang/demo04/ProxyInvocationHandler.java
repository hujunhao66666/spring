package com.kuang.demo04;

import com.kuang.demo03.Rent;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        //seeehouse();
        log(method.getName());
        Object result = method.invoke(target, objects);
        //fare();
        return result;
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
