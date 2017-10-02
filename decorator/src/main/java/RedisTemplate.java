/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public interface RedisTemplate {
    public void save(String key, String value);

    public String read(String key);
}
