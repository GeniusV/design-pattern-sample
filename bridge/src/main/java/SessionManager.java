/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public abstract class SessionManager {
    protected SessionRepository sessionRepository;

    public SessionManager() {
    }

    public SessionManager(SessionRepository sessionRepository) {

        this.sessionRepository = sessionRepository;
    }

    public void createSession(String session) {
        sessionRepository.saveSession(session);
    }

    public SessionRepository getSessionRepository() {
        return sessionRepository;
    }

    public void setSessionRepository(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }
}
