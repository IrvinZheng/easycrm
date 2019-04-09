package com.easy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Created by j on 2019/4/9.
 */
@Component
public class Redis {
    @Autowired
    StringRedisTemplate redisTemplate;

    public Boolean hasKey(String key){
        return redisTemplate.hasKey(key);
    }

    public String get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    public void set(String key,String value,Integer seconds){
        redisTemplate.opsForValue().set(key,value,seconds, TimeUnit.SECONDS);
    }

    public void set(String key,String value){
        redisTemplate.opsForValue().set(key,value);
    }
}
