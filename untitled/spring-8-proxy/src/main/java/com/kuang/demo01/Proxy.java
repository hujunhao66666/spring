package com.kuang.demo01;

public class Proxy {
    private Host host;
    public Proxy (Host host){
        this.host=host;
    }
    public void rent(){
        host.Rent();
    }
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
}
