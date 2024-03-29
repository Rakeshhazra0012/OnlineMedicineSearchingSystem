package com.cts.srcmed.controller;


import com.cts.srcmed.exception.InvalidCredentialsException;
import com.cts.srcmed.exception.UserDoesNotExistException;

import com.cts.srcmed.service.LoginService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class LoginControllerTest {

    @Mock
    private LoginService loginService;

    @InjectMocks
    private LoginController loginController;

    @Mock
    private Model model;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testHome() {
        String result = loginController.home();
        assertEquals("UserLogin", result);
    }

    void testLogin_ValidCredentials_Employer() throws UserDoesNotExistException, InvalidCredentialsException {
        String username = "john";
        String password = "password";
        String designation = "Employer";

        when(loginService.getDesignation(username)).thenReturn(designation);

        String result = loginController.login(username, password, model);

        verify(loginService).login(username, password);
        verify(loginService).getDesignation(username);
        verify(model).addAttribute("designation", designation);
        assertEquals("adminPage", result);
    }

    @Test
    void testLogin_ValidCredentials_NotEmployer() throws UserDoesNotExistException, InvalidCredentialsException {
        String username = "john";
        String password = "password";
        String designation = "Employee";

        when(loginService.getDesignation(username)).thenReturn(designation);

        String result = loginController.login(username, password, model);

        verify(loginService).login(username, password);
        verify(loginService).getDesignation(username);
        verify(model).addAttribute("designation", designation);
        assertEquals("welcome", result);
    }

    @Test
    void testLogin_InvalidCredentials() throws UserDoesNotExistException, InvalidCredentialsException {
        String username = "john";
        String password = "incorrect_password";

        doThrow(InvalidCredentialsException.class).when(loginService).login(username, password);

        String result = loginController.login(username, password, model);

        verify(loginService).login(username, password);
 
        assertEquals("UserLogin", result);
    }

    @Test
    void testLogin_UserDoesNotExist() throws UserDoesNotExistException, InvalidCredentialsException {
        String username = "john";
        String password = "password";

        doThrow(UserDoesNotExistException.class).when(loginService).login(username, password);

        String result = loginController.login(username, password, model);

        verify(loginService).login(username, password);

        assertEquals("UserLogin", result);
    }

    // Add more test methods for other controller methods

}
