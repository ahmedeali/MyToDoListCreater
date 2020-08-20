package com.amedsoft.todo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ui.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("My To Do Creater");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
