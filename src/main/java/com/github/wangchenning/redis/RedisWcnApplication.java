package com.github.wangchenning.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
//@EnableConfigurationProperties
public class RedisWcnApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisWcnApplication.class, args);
    }

}

