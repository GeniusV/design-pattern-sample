import com.sun.tools.internal.ws.resources.WebserviceapMessages;

/**
 * Copyright 2017 GeniusV
 * All rights reserved.
 * Created by GeniusV on 10/1/17.
 */
public class WebSessionManager extends SessionManager {

    public WebSessionManager() {
    }
    public WebSessionManager(SessionRepository sessionRepository) {
        super(sessionRepository);
    }

    public void createWebSession(String session) {
        sessionRepository.saveSession("web session");
    }
}
