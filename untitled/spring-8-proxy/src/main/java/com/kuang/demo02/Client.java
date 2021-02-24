package com.kuang.demo02;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl user=new UserServiceImpl();
        UserServiceProxy userServiceProxy=new UserServiceProxy();
        userServiceProxy.setUserService(user);
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.query();
        int [][]a={{1,2,3}};
        int n=a.length;
    }
}
