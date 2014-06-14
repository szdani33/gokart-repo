package hu.daniels.gokart.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class LapTimeColumn<S> extends SimpleAttributeColumn<S, Integer> {

	public LapTimeColumn(String title, String attrName) {
		super(title, attrName);
		setCellFactory(new LapTimeCellFactory());
	}

	private class LapTimeCellFactory implements Callback<javafx.scene.control.TableColumn<S, Integer>, javafx.scene.control.TableCell<S, Integer>> {
		private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("ss.SSS");

		public TableCell<S, Integer> call(TableColumn<S, Integer> param) {
			return new TableCell<S, Integer>() {
				@Override
				protected void updateItem(Integer item, boolean empty) {
					super.updateItem(item, empty);
					setText("");
					if (!empty) {
						setText(DATE_FORMAT.format(new Date(item)) + " s");
					}
				}
			};
		}
	}
}
