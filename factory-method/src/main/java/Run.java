/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class Run {
    public static void main(String[] args) {
        RedisTemplateFactory redisTemplateFactory = new SimpleRedisTemplateFactory();
//        RedisTemplateFactory redisTemplateFactory = new StringRedisTemplateFactory();
        RedisTemplate redisTemplate = redisTemplateFactory.getRedisTemplate();
    }
}
