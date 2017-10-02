/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class Run {
    public static void main(String[] args) {
        RedisTemplate redisTemplate = new SimpleRedisTemplate();
        redisTemplate.save("test", "test");
        redisTemplate = new WebRedisTemplateDecorator(redisTemplate);
        redisTemplate.save("test", "test");
    }
}
