package org.loose.fis.sre.services;

import javafx.collections.ObservableList;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;
import org.loose.fis.sre.model.Produs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProduseService {

    public static ObjectRepository<Produs> produsRepository;


    public static void addProduse(String nume, String pret, String tippiele)
    {

        Produs produs = new Produs(nume,pret,tippiele);
        produsRepository.insert(produs);

    }
    public static void getProdusePreturi(ObservableList<String> produse){
        for(Produs produs: produsRepository.find()) {
            if(produs.getNume()!=null)
                produse.add(produs.getNume()+" "+produs.getPret()+" "+produs.getTippiele());
        }
    }
    public static void getProdusePiele(ObservableList<String> produse){
        for(Produs produs: produsRepository.find()) {
            if(produs.getTippiele()!=null)
                produse.add(produs.getTippiele());
        }
    }

    public static ArrayList<Produs> getProduseSelectate(String piele){
        ArrayList<Produs> produse = new ArrayList<>();
        for(Produs produs : produsRepository.find())
            if(Objects.equals(piele, produs.getTippiele()))
                produse.add(produs);
        return produse;
    }

    public static ArrayList<Produs> getProduse(){
        ArrayList<Produs> produse = new ArrayList<>();
        for(Produs produs : produsRepository.find()) {
            produse.add(produs);
        }
        return produse;
    }

    public static List<Produs> getAllProdus() {
        return produsRepository.find().toList();
    }

}
