package com.webstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {


    @Bean
    public String helloWord(){
        return "helloWrod,hahaha";
    }
}
