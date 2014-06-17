package hu.daniels.gokart;

import hu.daniels.gokart.service.GokartService;
import hu.daniels.gokart.view.HeatView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import org.springframework.beans.factory.annotation.Autowired;

public class Main extends Application {

	@Autowired
	private GokartService service;

	@Override
	public void start(Stage primaryStage) {
		Label label = new Label("Dani");
		label.getStyleClass().add("daniLabel");

		HeatView table = new HeatView();
		table.setItems(service.loadHeats());

		VBox pane = new VBox();
		pane.getChildren().addAll(label, table);
		Scene scene = new Scene(pane, 500, 100, Color.BLACK);
		scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Gokart");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
