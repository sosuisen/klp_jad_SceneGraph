package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyApp extends Application {

	@Override
	public void start(Stage stage) {
		var label = new Label("Hello, KCG");
		label.setStyle("-fx-font-size: 60px; -fx-font-weight: bold;");
		
		var bPane = new BorderPane(label);
		
		var scene = new Scene(bPane, 640, 480);
		
		stage.setScene(scene);
		
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}