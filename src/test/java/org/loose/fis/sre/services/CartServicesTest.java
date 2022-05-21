package org.loose.fis.sre.services;

import org.junit.Test;
import org.loose.fis.sre.model.Produs;

import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CartServicesTest {
    @Test
    public void testCopyDefaultUserNotExists() throws Exception{
        ProduseService.initProdusDatabase();
        assertTrue(Files.exists(FileSystemService.getPathToFile()));
    }

    public void addCart()
    {
        int i = CartServices.getAllProdus().size();
        CartServices.addCos(new Produs("test","test","test"));
        assertEquals(i+1,UserService.getAllUsers().size());
    }
}

