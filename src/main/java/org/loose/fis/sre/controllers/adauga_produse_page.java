package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.loose.fis.sre.services.ProduseService;

public class adauga_produse_page {
    @FXML
    public TextField numeprodus;

    @FXML
    private TextField pretprodus;
    @FXML
    private TextField tippiele;
    @FXML
    private Button add;

    public void handleAddAction(ActionEvent actionEvent) {
        ProduseService.addProduse(numeprodus.getText(),pretprodus.getText(),tippiele.getText());
    }
}
