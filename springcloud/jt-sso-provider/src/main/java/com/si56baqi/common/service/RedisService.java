package com.si56baqi.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    //设置值
    public void set(String key, String val){
        redisTemplate.opsForValue().set(key,val);
    }

    //设置值，及过期时间
    public void set(String key, String val, Integer seconds){
        redisTemplate.opsForValue().set(key,val);
        redisTemplate.expire(key, seconds, TimeUnit.SECONDS);
    }

    //过期时间
    public void expire(String key, Integer seconds){
        redisTemplate.expire(key, seconds, TimeUnit.SECONDS);
    }

    //获取值
    public String get(String key){
        return redisTemplate.opsForValue().get(key).toString();
    }

}
