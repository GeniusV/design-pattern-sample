/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class Run {
    public static void main(String[] args) {
        SessionManager sessionManager = new WebSessionManager();
        SessionRepository sessionRepository = new RedisSessionRepository();
        sessionManager.setSessionRepository(sessionRepository);
        sessionManager.createSession("geniusv");
    }
}
