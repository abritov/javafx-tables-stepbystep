package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FxApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(ClassLoader.getSystemResource("main_scene.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("JavaFX tables");
        stage.setScene(scene);
        stage.show();
    }
}
