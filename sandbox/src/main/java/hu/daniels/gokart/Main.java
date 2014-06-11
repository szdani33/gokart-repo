package hu.daniels.gokart;

import hu.daniels.gokart.model.Heat;
import hu.daniels.gokart.model.Pilot;
import hu.daniels.gokart.view.HeatView;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import com.sun.javafx.collections.ObservableListWrapper;

@SuppressWarnings("restriction")
public class Main extends Application {

	private static final String PERSISTENCE_UNIT_NAME = "gokart";
	EntityManager em = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();

	@Override
	public void start(Stage primaryStage) {

		Label label = new Label("Dani");
		label.getStyleClass().add("daniLabel");

		HeatView table = new HeatView();
		table.setItems(getHeats());

		VBox pane = new VBox();
		pane.getChildren().addAll(label, table);
		Scene scene = new Scene(pane, 500, 100, Color.BLACK);
		scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Gokart");
		primaryStage.show();
	}

	private ObservableList<Heat> getHeats() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Heat> query = builder.createQuery(Heat.class);

		Root<Heat> heat = query.from(Heat.class);
		Join<Heat, Pilot> pilot = heat.join("pilot");

		query.where(builder.equal(pilot.get("nickName"), "Dani"));

		TypedQuery<Heat> tq = em.createQuery(query);

		return new ObservableListWrapper<Heat>(tq.getResultList());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
