package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartController {

	@FXML
	private Button startButton;
	
	private Stage currStage;
	
	public StartController(Stage s) {
		this.currStage = s;
	}
	
	@FXML
	public void initialize() {
		
	}
	
	@FXML
	public void handleStartButton() {
		CounterScreen s = new CounterScreen(currStage);
		s.start();
	}

}
