package com.kuang.demo03;

import com.kuang.demo03.Rent;

public class Host implements Rent{


    @Override
    public void rent() {
        System.out.println("我要租房子了" );
    }
}
