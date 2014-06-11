package hu.daniels.gokart.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class DateColumn<S> extends SimpleAttributeColumn<S, Date> {


	public DateColumn(String title, String attrName) {
		super(title, attrName);
		setCellFactory(new DateCellFactory());
	}

	private class DateCellFactory implements Callback<javafx.scene.control.TableColumn<S, Date>, javafx.scene.control.TableCell<S, Date>> {

		private final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy.MM.dd");

		public TableCell<S, Date> call(TableColumn<S, Date> param) {
			return new TableCell<S, Date>() {
				@Override
				protected void updateItem(Date item, boolean empty) {
					super.updateItem(item, empty);
					setText("");
					if (!empty) {
						setText(DATE_FORMAT.format(item));
					}
				}
			};
		}
	}
}
