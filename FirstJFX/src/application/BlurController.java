package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;

import javafx.scene.layout.Pane;

public class BlurController {
	
	@FXML
    private Pane pane;   


	@FXML
    public void setblur() {          // da desenfoque 
             pane.setEffect(new GaussianBlur(20));

    }
	@FXML
    public void focus() {          // da desenfoque 
             pane.setEffect(new GaussianBlur(0));

	}
	@FXML    // cierra la app
	private void handleClose() {
	
	        System.exit(0);
	        
	}
	
}