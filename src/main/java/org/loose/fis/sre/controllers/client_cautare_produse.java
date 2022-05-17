package org.loose.fis.sre.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.loose.fis.sre.model.Produs;
import org.loose.fis.sre.services.CartServices;
import org.loose.fis.sre.services.ProduseService;

import java.io.IOException;

public class client_cautare_produse {


    public ChoiceBox cc;
    @FXML
    private TableView<Produs> tabelproduse;
    @FXML
    private TableColumn<Produs, String> nume;
    @FXML
    private TableColumn<Produs, String> pret;
    @FXML
    private TableColumn<Produs, String> tippiele;


    private ObservableList<String> items = FXCollections.observableArrayList();
    private ObservableList<String> items2 = FXCollections.observableArrayList();

    public void initialize() {
        nume.setCellValueFactory(new PropertyValueFactory<>("nume"));
        pret.setCellValueFactory(new PropertyValueFactory<>("pret"));
        tippiele.setCellValueFactory(new PropertyValueFactory<>("tippiele"));

        //tabelproduse.setItems(produse);

    }

    @FXML
    public void cbOnAction(ActionEvent event)throws IOException {
        ProduseService.getProdusePiele(items);
        cc.getItems().addAll(items);

    }
    @FXML
    public void seeOnAction(ActionEvent event)throws IOException{
        if(cc.getSelectionModel().getSelectedItem()!=null){
            String piele=cc.getSelectionModel().getSelectedItem().toString();
            ObservableList<Produs> produse1 = FXCollections.observableArrayList(ProduseService.getProduseSelectate(piele));
            tabelproduse.setItems(produse1);
        }
    }
    public void handleButonInapoi() throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("client_main_page.fxml"));
        Stage stage = (Stage) tabelproduse.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    public void handleAdaugareCos() {
        ObservableList<Produs> typesSelected;
        typesSelected = tabelproduse.getSelectionModel().getSelectedItems();
        for(Produs pr: typesSelected)
        {
            CartServices.addCos(pr);
        }
    }


    //ObservableList<Produs> produse = FXCollections.observableArrayList(ProduseService.getProduseSelectate());


}
