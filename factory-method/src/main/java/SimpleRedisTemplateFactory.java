/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class SimpleRedisTemplateFactory implements RedisTemplateFactory {
    @Override
    public RedisTemplate getRedisTemplate() {
        return new SimpleRedisTemplate();
    }
}
