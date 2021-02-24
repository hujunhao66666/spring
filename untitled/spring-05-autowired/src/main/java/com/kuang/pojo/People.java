package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class People {
    @Autowired
    private Dog dog;
    @Autowired
    private Cat cat;
    private String name;

    public People(@Nullable  String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog getDog() {
        return dog;
    }


    public Cat getCat() {
        return cat;
    }



    public String getName() {
        return name;
    }


}
