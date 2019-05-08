package com.github.wangchenning.redis.redis;

/**
 * @author Musk
 * 登陆过期时间
 */
public class UserKey extends BasePrefix{

	public static final int TOKEN_EXPIRE = 3600*24 * 2;
	private String prefix ;
	private UserKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
		this.prefix = prefix;
	}
	public static UserKey token = new UserKey(TOKEN_EXPIRE, "tk");
	
	public static UserKey getById = new UserKey(0, "id");
	
	public UserKey withExpire(int seconds) {
		return new UserKey(seconds, prefix);
	}
}
