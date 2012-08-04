package com.enterprise.crm.login;

import com.enterprise.crm.navigation.Pages;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jamescrabbe
 */
@Named
@Stateful
@SessionScoped
public class LoginGateway {

    @Inject
    LoginAuthenitcatorService authenitcator;
    private String username;
    private String password;
    private String welcomeMessage;
    private boolean invalidLoginAttempt;

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String login() {
        String responsePage = Pages.WELCOME.getURLRedirect();
        LoginResponse response = authenitcator.authenticate(username, password);
        if (response.isValid()) {
            responsePage = Pages.HOME.getURLRedirect();
            invalidLoginAttempt = false;
        } else {
            invalidLoginAttempt = true;
        }

        return responsePage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isInvalidLoginAttempt() {
        return invalidLoginAttempt;
    }

    public void setInvalidLoginAttempt(boolean inValidLoginAttempt) {
        this.invalidLoginAttempt = inValidLoginAttempt;
    }
}
