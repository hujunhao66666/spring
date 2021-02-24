package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(kuangConfig2.class)
public class kuangConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}
