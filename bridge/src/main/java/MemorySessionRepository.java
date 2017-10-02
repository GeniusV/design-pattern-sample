/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class MemorySessionRepository implements SessionRepository {

    @Override
    public void saveSession(String session) {
        System.out.println("saving session to memory: [" + session + "]");
    }

    @Override
    public String getSession() {
        return null;
    }
}
