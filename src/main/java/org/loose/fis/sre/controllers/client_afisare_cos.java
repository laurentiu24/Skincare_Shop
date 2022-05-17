package org.loose.fis.sre.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.loose.fis.sre.model.Produs;
import org.loose.fis.sre.services.CartServices;

import java.io.IOException;

public class client_afisare_cos {
    @FXML
    private TableView<Produs> tabelproduse;
    @FXML
    private TableColumn<Produs, String> nume;
    @FXML
    private TableColumn<Produs, String> pret;
    @FXML
    private TableColumn<Produs, String> tippiele;
    @FXML
    private Label mesaj;

    public void initialize() {
        nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        pret.setCellValueFactory(new PropertyValueFactory<>("pret"));
        tippiele.setCellValueFactory(new PropertyValueFactory<>("tippiele"));
        tabelproduse.setItems(produse);
        int c=0;
        for(Produs p:produse)
        {
            c++;
        }
        if(c>2)
        {
            mesaj.setText("Aveti o reducere de 25%");
        }
        else
            mesaj.setText("O sa beneficiati de o reducere daca o sa aveti peste 3 produse in cos");
    }

    ObservableList<Produs> produse = FXCollections.observableArrayList(CartServices.getProduse());


    public void handleButonInapoi(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client_main_page.fxml"));
        Stage stage = (Stage) tabelproduse.getScene().getWindow();
        stage.setScene(new Scene(root));
    }



}

