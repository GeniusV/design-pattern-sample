/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class SimpleSessionManager extends SessionManager {

    public SimpleSessionManager() {

    }

    public SimpleSessionManager(SessionRepository sessionRepository) {
        super(sessionRepository);
    }

    public void createSimpleSession(String session) {
        sessionRepository.saveSession("simple session");
    }
}
