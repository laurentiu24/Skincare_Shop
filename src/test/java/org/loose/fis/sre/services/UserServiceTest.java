package org.loose.fis.sre.services;

import org.junit.Test;
import org.loose.fis.sre.exceptions.NoUpperCaseException;
import org.loose.fis.sre.exceptions.UncompletedFieldsException;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistException;

import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserServiceTest {
    private UserService UserSevice;

    @Test
    public void testCopyDefaultUserNotExists() throws Exception {
        //UserSevice.initDatabase();
        //assertTrue(Files.exists(FileSystemService.getPathToFile()));
    }

    @Test
    public void addOneUser() throws UsernameAlreadyExistException, NoUpperCaseException, UncompletedFieldsException {
        int i = UserService.getAllUsers().size();
        UserService.addUser("test", "Test", "test", "test", "test", "test");
        assertEquals(i + 1, UserService.getAllUsers().size());
        UserService.delete("test");

    }
}

