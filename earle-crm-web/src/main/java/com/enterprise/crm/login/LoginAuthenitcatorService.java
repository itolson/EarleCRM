/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enterprise.crm.login;

import com.enterprise.crm.common.CrudService;
import com.enterprise.crm.common.QueryParameters;
import java.io.Serializable;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author jamescrabbe
 */
@Named
@Default
public class LoginAuthenitcatorService implements Serializable {

    private static final int MAX_LOGIN_FAILED_LOGIN_ATTEMPTS = 3;
    
    @Inject
    CrudService crudService;
    private static final long serialVersionUID = 1L;
    
    public LoginResponse authenticate(String userId, String password) {
        LoginResponse response = new LoginResponse();
        
        UserDetails userDetails = loadUserDetails(userId);
        
        if (userDetails != null) {
            boolean authenticated = isAuthenitcated(userDetails, userId, password);
            response.setValid(authenticated);
            
            if (!authenticated) {
                incrementFailedLoginAttempts(userDetails);
            } else {
                userDetails.setFailedLoginAttempts(0);
            }
            
        }
        
        return response;
    }
    
    private UserDetails loadUserDetails(String userId) {
        return crudService.findUniqueWithNamedQuery("UserDetails.getUserForUsername", QueryParameters.withParameters("userId", userId));
    }
    
    private boolean isAuthenitcated(UserDetails userDetails, String userId, String password) {
        return (userDetails.getPassword().equals(password) && MAX_LOGIN_FAILED_LOGIN_ATTEMPTS <= userDetails.getFailedLoginAttempts());
    }
    
    private void incrementFailedLoginAttempts(UserDetails userDetails) {
        int failedAttempts = userDetails.getFailedLoginAttempts() + 1;
        userDetails.setFailedLoginAttempts(failedAttempts);
    }
}
