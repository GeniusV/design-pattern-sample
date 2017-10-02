/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class RedisTemplateDecorator implements RedisTemplate {

    private RedisTemplate redisTemplate;

    public RedisTemplateDecorator(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public RedisTemplateDecorator() {
    }

    @Override
    public void save(String key, String value) {
        redisTemplate.save(key, value);
    }

    @Override
    public String read(String key) {
        String result = redisTemplate.read(key);
        return result;
    }

    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
