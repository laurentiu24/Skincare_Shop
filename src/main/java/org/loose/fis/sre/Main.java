package org.loose.fis.sre;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.loose.fis.sre.services.CartServices;
import org.loose.fis.sre.services.FileSystemService;
import org.loose.fis.sre.services.ProduseService;
import org.loose.fis.sre.services.UserService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        initDirectory();
        CartServices.initProdusDatabase();
        ProduseService.initProdusDatabase();
        UserService.initDatabase();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Login.fxml")));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 725, 490));
        primaryStage.show();
    }

    private void initDirectory() {
        Path applicationHomePath = FileSystemService.APPLICATION_HOME_PATH;
        if (!Files.exists(applicationHomePath))
            applicationHomePath.toFile().mkdirs();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
