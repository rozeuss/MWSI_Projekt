package main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import objects.Car;

import java.util.ArrayList;

/**
 * Created by Kasia on 2016-12-20.
 */
public class Main extends Application {

	public static void main(String[] args) {

		ArrayList cars = new ArrayList<Car>();

		Car car = new Car("1234", "Jan", "Kowalski", "20-03-12", "10-06-16");
		cars.add(car);

		System.out.println(cars.get(0));

		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/MainPanel.fxml"));
		Pane pane = loader.load();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Maino Panello");
		//primaryStage.setResizable(false);
		primaryStage.show();

	}
}
