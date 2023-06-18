package com.pg.gateway.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;



@Component
public class RedisTemplateUtil {


    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void setValue(String key, int id, Object value) {

        redisTemplate.opsForHash().put(key, id, value);

    }

    public Object getValue(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void deleteKey(String key) {
        redisTemplate.delete(key);
    }


}

