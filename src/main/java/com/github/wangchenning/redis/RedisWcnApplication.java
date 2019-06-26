//package com.github.wangchenning.redis;
//
//import com.github.wangchenning.redis.annotation.EnableRedisWcn;
//import com.github.wangchenning.redis.redis.RedisService;
//import com.github.wangchenning.redis.redis.UserKey;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
////@EnableConfigurationProperties
////@EnableRedisWcn
//public class RedisWcnApplication implements ApplicationRunner {
//    @Autowired(required = false)
//    RedisService redisService;
//
//    public static void main(String[] args) {
//        SpringApplication.run(RedisWcnApplication.class, args);
//    }
//
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        if (redisService == null) {
//            return;
//        }
//        try {
//            Object o = redisService.get(UserKey.getById, "123", Object.class);
//            System.out.println(o);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
//
