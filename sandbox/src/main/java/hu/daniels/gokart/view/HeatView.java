package hu.daniels.gokart.view;

import hu.daniels.gokart.model.Heat;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class HeatView extends TableView<Heat> {
	public HeatView() {
		getColumns().add(new DateColumn<Heat>("Date", "date"));
		getColumns().add(new LapTimeColumn<Heat>("Best lap", "bestLap"));
		getColumns().add(createColumn(Integer.class, "Kart #", "kartNumber"));
		// setItems(createData());
	}

	// private ObservableList<Heat> createData() {
	// return FXCollections.observableArrayList(createHeat(new Date(), 37875, 2), createHeat(new Date(), 36223, 5));
	// }
	//
	// private Heat createHeat(Date date, int bestLap, int kartNumber) {
	// Heat heat = new Heat();
	// heat.setDate(date);
	// heat.setBestLap(bestLap);
	// heat.setKartNumber(kartNumber);
	// return heat;
	// }

	private <T> TableColumn<Heat, T> createColumn(T clazz, String title, String attrName) {
		TableColumn<Heat, T> column = new TableColumn<Heat, T>(title);
		column.setCellValueFactory(new PropertyValueFactory<Heat, T>(attrName));
		return column;
	}
}
