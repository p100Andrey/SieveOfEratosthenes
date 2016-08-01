package com.javaonline3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EntryPointFX extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent panel = FXMLLoader.load(getClass().getResource("view/main.fxml"));
        primaryStage.setScene(new Scene(panel));
        primaryStage.setTitle("Eratosthenes finder");
        primaryStage.show();
    }
}