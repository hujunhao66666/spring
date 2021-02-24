package com.kuang.pojo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user")
public class User {
    private int id;
    private String name;
    private String pwd;
}
