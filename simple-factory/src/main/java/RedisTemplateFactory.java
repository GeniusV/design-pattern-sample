/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class RedisTemplateFactory {
    public RedisTemplate getRedisTemplate(String className) {
        if (className.equals(StringRedisTemplate.class.getSimpleName())) {
            return new StringRedisTemplate();
        } else if (className.equals(SimpleRedisTemplate.class.getSimpleName())) {
            return new SimpleRedisTemplate();
        } else {
            return null;
        }
    }
}
