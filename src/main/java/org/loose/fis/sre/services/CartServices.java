package org.loose.fis.sre.services;

import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;
import org.loose.fis.sre.model.Produs;

import java.util.ArrayList;
import java.util.List;

import static org.loose.fis.sre.services.FileSystemService.getPathProdusToFile;

public class CartServices {
    public static ObjectRepository<Produs> cartRepository;

    public static void initProdusDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathProdusToFile("Cart.db").toFile())
                .openOrCreate("admin", "admin1");

        cartRepository = database.getRepository(Produs.class);

    }

    public static void addCos(Produs p)
    {
        cartRepository.insert(p);
    }

    public static ArrayList<Produs> getProduse()
    {
        ArrayList<Produs> produse = new ArrayList<>();
        for(Produs produs : cartRepository.find()) {
            produse.add(produs);
        }
        return produse;
    }

    public static void close() {
        cartRepository.close();
    }

    public static List<Produs> getAllProdus() {
        return cartRepository.find().toList();
    }

}
