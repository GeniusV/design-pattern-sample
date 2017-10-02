/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class WebRedisTemplateDecorator extends RedisTemplateDecorator {
    public WebRedisTemplateDecorator(RedisTemplate redisTemplate) {
        super(redisTemplate);
    }

    public WebRedisTemplateDecorator() {
    }

    @Override
    public void save(String key, String value) {
        key = addWebPrefix(key);
        super.save(key, value);
    }

    public String addWebPrefix(String key) {
        return "web_" + key;
    }
}
