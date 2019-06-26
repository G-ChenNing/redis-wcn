package com.github.wangchenning.redis.annotation;

import com.github.wangchenning.redis.redis.RedisPoolFactory;
import com.github.wangchenning.redis.redis.RedisService;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({RedisPoolFactory.class,RedisService.class})
public @interface EnableRedisWcn {
}
