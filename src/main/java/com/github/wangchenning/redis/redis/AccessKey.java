package com.github.wangchenning.redis.redis;

/**
 * @author Musk
 * 中间件限流
 */
public class AccessKey extends BasePrefix{

	private AccessKey( int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
	}
	
	public static AccessKey withExpire(int expireSeconds) {
		return new AccessKey(expireSeconds, "access");
	}
	
}
