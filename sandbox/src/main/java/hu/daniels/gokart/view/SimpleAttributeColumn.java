package hu.daniels.gokart.view;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class SimpleAttributeColumn<S, T> extends TableColumn<S, T> {
	public SimpleAttributeColumn(String title, String attrName) {
		super(title);
		setCellValueFactory(new PropertyValueFactory<S, T>(attrName));
	}
}
