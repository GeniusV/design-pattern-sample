/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class RedisRepositoryRedisTemplateAdapter extends RedisRepository {
    private RedisTemplate redisTemplate;

    public RedisRepositoryRedisTemplateAdapter(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void insert(String key, String value) {
        System.out.println("new insert using redis set: " + key + value);
    }

    public RedisTemplate getRedisTemplate() {
        return redisTemplate;
    }

    public void setRedisTemplate(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
}
