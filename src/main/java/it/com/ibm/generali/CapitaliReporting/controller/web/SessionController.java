package it.com.ibm.generali.CapitaliReporting.controller.web;

import it.com.ibm.generali.CapitaliReporting.model.User;

import javax.servlet.http.HttpSession;

class SessionController
{

    private static final String LOGGED_USER = "loggedUser";

    public User getCurrentUser(HttpSession session)
    {
        if (session.getAttribute(LOGGED_USER) != null)
        {
            return (User) session.getAttribute(LOGGED_USER);
        }

        return null;
    }

    public void saveUserSession(HttpSession session, User user)
    {
        session.setAttribute(LOGGED_USER, user);
    }

    public boolean isLogged(HttpSession session)
    {
        return (this.getCurrentUser(session) != null);
    }

}
