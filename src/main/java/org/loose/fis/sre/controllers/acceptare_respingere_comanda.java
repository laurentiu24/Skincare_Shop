package org.loose.fis.sre.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.loose.fis.sre.model.Produs;
import org.loose.fis.sre.services.CartServices;

import java.io.IOException;

public class acceptare_respingere_comanda {
    @FXML
    private Button afisare;
    @FXML
    private TableView<Produs> tabel_comenzi;
    @FXML
    private TableColumn<Produs, String> nume;
    @FXML
    private TableColumn<Produs, String> pret;
    @FXML
    private TableColumn<Produs, String> tippiele;

    public void initialize() {
        nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        pret.setCellValueFactory(new PropertyValueFactory<>("price"));
        tippiele.setCellValueFactory(new PropertyValueFactory<>("tippiele"));
        tabel_comenzi.setItems(prod);
    }

    ObservableList<Produs> prod = FXCollections.observableArrayList(CartServices.getProduse());




    public void handleButonInapoi() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("admin_main_page.fxml"));
        Stage stage = (Stage) tabel_comenzi.getScene().getWindow();
        stage.setScene(new Scene(root));

    }

    public void onAccAction() {
    }

    public void onResAction() {
    }

}

