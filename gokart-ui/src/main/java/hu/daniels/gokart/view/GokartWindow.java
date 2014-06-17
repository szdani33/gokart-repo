package hu.daniels.gokart.view;

import hu.daniels.gokart.service.GokartService;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import org.springframework.beans.factory.annotation.Autowired;

public class GokartWindow extends VBox {

	@Autowired
	private GokartService service;

	private HeatView table;

	public GokartWindow() {
		Label label = new Label("Dani");
		label.getStyleClass().add("daniLabel");
		table = new HeatView();
		getChildren().addAll(label, table);
	}

	public void loadItems() {
		table.setItems(service.loadHeats());
	}
}
