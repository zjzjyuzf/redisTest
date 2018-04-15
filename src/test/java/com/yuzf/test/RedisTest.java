package com.yuzf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yuzf.demo.config.RedisConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RedisConfig.class)
public class RedisTest {
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	@Test
	public void test() {
		stringRedisTemplate.opsForValue().set("james", "harden");
	}
	
}
