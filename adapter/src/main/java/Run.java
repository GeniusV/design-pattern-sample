/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class Run {
    public static void original() {
        RedisRepository redisRepository = new RedisRepository();
        redisRepository.insert("test", "test");
    }

    public static void adapt() {
        RedisRepository redisRepository = new RedisRepositoryRedisTemplateAdapter(new RedisTemplate());
        redisRepository.insert("test", "test");
    }

    public static void main(String[] args) {
        original();
        adapt();
    }
}

