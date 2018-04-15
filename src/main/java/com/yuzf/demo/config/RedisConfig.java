package com.yuzf.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.yuzf.demo.domain.Product;


@Configuration
public class RedisConfig {
	
	@Bean
	public RedisConnectionFactory redisCF() {
		JedisConnectionFactory jedisConnectionFactory  = new JedisConnectionFactory();
//		jedisConnectionFactory.setDatabase(0);
//		jedisConnectionFactory.setHostName("loaclhost");
//		jedisConnectionFactory.setPort(6379);
		jedisConnectionFactory.setPassword("123456");
		return jedisConnectionFactory;
	}
	
	@Bean
	public RedisTemplate<String,Product> redisTemplate(RedisConnectionFactory cf){
		RedisTemplate<String,Product> redisTemplate = new RedisTemplate<String,Product>();
		redisTemplate.setConnectionFactory(cf);
		return redisTemplate;
	}
	
	@Bean
	public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory cf) {
		return new StringRedisTemplate(cf);
	}
	
}
