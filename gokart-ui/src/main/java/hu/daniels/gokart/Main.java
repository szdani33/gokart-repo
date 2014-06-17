package hu.daniels.gokart;

import hu.daniels.gokart.view.GokartWindow;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main extends Application {

	private ClassPathXmlApplicationContext context;

	@Override
	public void start(Stage primaryStage) {
		context = new ClassPathXmlApplicationContext(new String[] { "spring-beans.xml" });
		
		GokartWindow window = (GokartWindow) context.getBean("gokartWindow");
		window.loadItems();

		Scene scene = new Scene(window, 500, 100, Color.BLACK);
		scene.getStylesheets().add(Main.class.getResource("/style.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Gokart");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
