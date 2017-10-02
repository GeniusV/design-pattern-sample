/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class RedisSessionRepository implements SessionRepository {
    @Override
    public void saveSession(String session) {
        System.out.println("saving session to redis: [" + session + "]");
    }

    @Override
    public String getSession() {
        return null;
    }
}
