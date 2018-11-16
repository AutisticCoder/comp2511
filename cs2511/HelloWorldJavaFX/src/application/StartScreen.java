package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class StartScreen {
	private Stage s;
	private String title;
	private FXMLLoader fxmlLoader;
	
	public StartScreen(Stage s) {
		this.s = s;
		this.title = "Start screen";
		this.fxmlLoader = new FXMLLoader(getClass().getResource("Start.fxml"));
	}
	
	public void start() {
		s.setTitle(title);
		fxmlLoader.setController(new StartController(s));
		try {
			Parent root = fxmlLoader.load();
			Scene sc = new Scene(root, 500, 600);
			s.setScene(sc);
			s.show();
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}
}
