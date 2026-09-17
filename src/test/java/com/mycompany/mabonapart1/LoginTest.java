/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.mabonapart1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {

    public LoginTest() {
    }

    @Test
    public void testCheckUserNameCorrectlyFormatted() {
        Login login = new Login();
        login.setUsername("kyl_1");
        
        boolean result = login.checkUserName();
        assertTrue(result);
    }

    @Test
    public void testCheckUserNameIncorrectlyFormatted() {
        Login login = new Login();
        login.setUsername("kyle!!!!!!");
        
        boolean result = login.checkUserName();
        assertFalse(result);
    }

    @Test
    public void testPasswordMeetsComplexity() {
        Login login = new Login();
        login.setPassword("Ch&&sec@ke99!");
        
        boolean result = login.checkPasswordComplexity();
        assertTrue(result);
    }

    @Test
    public void testPasswordDoesNotMeetComplexity() {
        Login login = new Login();
        login.setPassword("password");
        
        boolean result = login.checkPasswordComplexity();
        assertFalse(result);
    }

    @Test
    public void testCellPhoneCorrectlyFormatted() {
        Login login = new Login();
        login.setCellPhoneNumber("+27838968976");
        
        boolean result = login.checkCellPhoneNumber();
        assertTrue(result);
    }

    @Test
    public void testCellPhoneIncorrectlyFormatted() {
        Login login = new Login();
        login.setCellPhoneNumber("08966553");
        
        boolean result = login.checkCellPhoneNumber();
        assertFalse(result);
    }

    @Test
    public void testLoginUserSuccess() {
        Login login = new Login();
        login.setUsername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");

        boolean actual = login.loginUser("kyl_1", "Ch&&sec@ke99!");
        assertTrue(actual);
    }

    @Test
    public void testLoginUserFailed() {
        Login login = new Login();
        login.setUsername("kyl_1");
        login.setPassword("Ch&&sec@ke99!");

        boolean actual = login.loginUser("kyl_1", "wrongPassword");
        assertFalse(actual);
    }
}
