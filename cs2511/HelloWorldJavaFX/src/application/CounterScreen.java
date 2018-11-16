package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CounterScreen {

	private Stage s;
	private String title;
	private FXMLLoader fxmlLoader;
	
	public CounterScreen(Stage s) {
		this.s = s;
		this.title = "Count screen";
		this.fxmlLoader = new FXMLLoader(getClass().getResource("Count.fxml"));
	}
	
	public void start() {
		s.setTitle(title);
		fxmlLoader.setController(new CounterController(s));
		try {
			Parent root = fxmlLoader.load();
			Scene sc = new Scene(root, 500, 600);
			s.setScene(sc);
			s.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
