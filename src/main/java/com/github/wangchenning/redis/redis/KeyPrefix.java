package com.github.wangchenning.redis.redis;

public interface KeyPrefix {
		
	int expireSeconds();
	
	String getPrefix();
	
}
