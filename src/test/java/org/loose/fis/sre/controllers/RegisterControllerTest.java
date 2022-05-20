package org.loose.fis.sre.controllers;

import org.junit.BeforeClass;
import org.junit.Test;
import org.loose.fis.sre.exceptions.NoUpperCaseException;
import org.loose.fis.sre.exceptions.UncompletedFieldsException;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistException;
import org.loose.fis.sre.services.UserService;

import static org.junit.Assert.assertEquals;

public class RegisterControllerTest {

    private static final String test_username = "Test-username";
    private static final String test_password = "Test-password";
    private static final String name = "Test-name";
    private static final String email = "Test-email";
    private static final String phone = "Test-Phone";
    private static final String address = "Test-adress";
    private static int contor;
    private static UserService UserSevice;

    @BeforeClass
    public static void setUp() throws Exception{
        UserSevice.initDatabase();
        contor = UserService.getAllUsers().size();
    }

    @Test
    public void testHandleAddUser() throws UsernameAlreadyExistException, NoUpperCaseException, UncompletedFieldsException {
        UserSevice.addUser(test_username,test_password,name,email,address,phone);
        assertEquals(contor+1,UserSevice.getAllUsers().size());
        UserService.delete(test_username);
    }
}