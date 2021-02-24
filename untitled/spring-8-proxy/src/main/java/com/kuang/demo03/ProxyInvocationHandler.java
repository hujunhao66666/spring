package com.kuang.demo03;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        seeehouse();
        Object result = method.invoke(rent, objects);
        fare();
        return result;
    }

    public void seeehouse(){
        System.out.println("看房子");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
