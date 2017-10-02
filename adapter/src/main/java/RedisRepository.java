import com.sun.tools.corba.se.idl.StringGen;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class RedisRepository {
    public void insert(String key, String value) {
        System.out.println("insert: " +key + value);
    }
}
