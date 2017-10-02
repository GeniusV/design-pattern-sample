/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class SimpleRedisTemplate implements RedisTemplate {

    @Override
    public void save(String key, String value) {
        System.out.println("saving: [" + key + "," + value + "]");
    }

    @Override
    public String read(String key) {
        System.out.println("reading: [" + key + "]");
        return key;
    }


}
