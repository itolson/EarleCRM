/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enterprise.crm.login;

import com.enterprise.crm.login.LoginAuthenitcatorService;
import com.enterprise.crm.login.UserDetails;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import com.enterprise.crm.common.CrudService;
import com.enterprise.crm.common.QueryParameters;
import org.mockito.Mock;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

/**
 *
 * @author jamescrabbe
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginAuthenitcatorTest {

    private static final String ADMIN_PASSWORD = "password";
    private static final String ADMIN_USERNAME = "admin";
    @Mock
    CrudService crudService;
    private LoginAuthenitcatorService loginAuthenitcator;

    @Before
    public void setUp() {
        loginAuthenitcator = new LoginAuthenitcatorService();
        loginAuthenitcator.crudService = crudService;
    }

    @Test
    public void testisValid() {
        UserDetails user = createUser(ADMIN_USERNAME, ADMIN_PASSWORD);
        when(crudService.findUniqueWithNamedQuery("UserDetails.getUserForUsername", QueryParameters.withParameters("userId", ADMIN_USERNAME))).thenReturn(user);
        //assertThat(loginAuthenitcator.authenticate(ADMIN_USERNAME,ADMIN_PASSWORD), is(true));

        user = createUser(ADMIN_USERNAME, null);
        when(crudService.findUniqueWithNamedQuery("UserDetails.getUserForUsername", QueryParameters.withParameters("userId", ADMIN_USERNAME))).thenReturn(null);
        //assertThat(loginAuthenitcator.authenticate(null,null), is(false));

        user = createUser("anything", null);
        when(crudService.findUniqueWithNamedQuery("UserDetails.getUserForUsername", QueryParameters.withParameters("userId", ADMIN_USERNAME))).thenReturn(user);
        //assertThat(loginAuthenitcator.authenticate("anything",null), is(false));

        user = null;
        when(crudService.findUniqueWithNamedQuery("UserDetails.getUserForUsername", QueryParameters.withParameters("userId", ADMIN_USERNAME))).thenReturn(user);
        //assertThat(loginAuthenitcator.authenticate(null,"anything"), is(false));

        user = createUser("anything", "anything");
        when(crudService.findUniqueWithNamedQuery("UserDetails.getUserForUsername", QueryParameters.withParameters("userId", ADMIN_USERNAME))).thenReturn(ADMIN_PASSWORD);
        //assertThat(loginAuthenitcator.authenticate("anything","anything"), is(false));

        user = createUser("anything", "anything");
        when(crudService.findUniqueWithNamedQuery("UserDetails.getUserForUsername", QueryParameters.withParameters("userId", ADMIN_USERNAME))).thenReturn("invalid");
        //assertThat(loginAuthenitcator.authenticate("anything",ADMIN_PASSWORD), is(false));

    }

    private UserDetails createUser(String userId, String password) {
        UserDetails user = new UserDetails();
        user.setUserId(userId);
        user.setPassword(password);
        return user;
    }
}
