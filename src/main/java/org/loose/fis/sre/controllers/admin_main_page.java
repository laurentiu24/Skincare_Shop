package org.loose.fis.sre.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.loose.fis.sre.model.User;

import java.io.IOException;

public class admin_main_page {
    @FXML
    private Button butonEditareProduseSiPreturi;
    @FXML
    private Button butonAdaugareProduseSiPreturi;
    @FXML
    private Button butonVizualizareComenziInAsteptare;
    @FXML
    private Button AcceptareRespingereComanda;
    @FXML
    private Button butonDeconectare;
    @FXML
    private Button butonAdaugareServiciiSiPreturi;
    @FXML
    private User user;
    @FXML
    private Button buttonCreate;
    @FXML
    private Text registrationMessage;


    private  String userName;

    public  void setUser(User user){
        this.user=user;
    }

    public void handleProduseSiPreturi() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("adauga_produse.fxml"));
            Stage stage = (Stage) (butonEditareProduseSiPreturi.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }


    public void handleVizualizareListaComenziInAsteptare() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("vizualizarelistaclientiinasteptare.fxml"));
            Stage stage = (Stage) (butonVizualizareComenziInAsteptare.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }
    public void handleAcceptareRespingereComanda() throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("acceptare_respingere_comanda.fxml"));
        Stage stage = (Stage) butonDeconectare.getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    public void handleAdaugaProduse() throws IOException{
        try {
            Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("adauga_produse.fxml"));
            Stage stage=(Stage) (butonAdaugareProduseSiPreturi.getScene().getWindow());
            stage.setScene((new  Scene(root)));

        }
        catch (IOException e)
        {
            System.out.println("Error");
        }
    }
    public void handleDeconectare() throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("login.fxml"));
            Stage stage = (Stage) (butonDeconectare.getScene().getWindow());
            stage.setScene(new Scene(root));

            stage.show();
        }
        catch (IOException e)
        {
            System.out.println("eroare");
        }
    }
    @FXML
    public void handleRegisterAction() throws Exception{
        try{
            Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("register.fxml"));
            Stage stage = (Stage) (buttonCreate.getScene().getWindow());
            stage.setScene(new Scene(root));
            stage.show();

        } catch(IOException e){
            registrationMessage.setText("eroare!");
        }
    }
    @FXML
    public void handleAdaugareProduseSiPreturi() throws IOException {
        Parent root= FXMLLoader.load(getClass().getClassLoader().getResource("adauga_produse.fxml"));
        Stage stage = (Stage) (butonAdaugareProduseSiPreturi.getScene().getWindow());
        stage.setScene(new Scene(root));
        stage.show();


    }


}
