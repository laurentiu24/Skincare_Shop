package org.loose.fis.sre.services;

import org.junit.Test;

import java.nio.file.Files;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProdusServiceTest {
    @Test
    public void testCopyDefaultUserNotExists() throws Exception{
        ProduseService.closeProdusDatabase();
        ProduseService.initProdusDatabase();
        assertTrue(Files.exists(FileSystemService.getPathToFile()));
    }

    public void addProdus()
    {
        int i = ProduseService.getAllProdus().size();
        ProduseService.addProduse("test","test","test");
        assertEquals(i+1,UserService.getAllUsers().size());
    }
}
