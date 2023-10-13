package gr.uop;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ThankYouController {
    
    @FXML
    private Button continueButton;

    public Button getContinueButton() {
        return continueButton;
    }

    public void setContinueButton(String continueButton) {
        this.continueButton.setText(continueButton);
    }

    @FXML
    public void switchToNextScene(ActionEvent event) throws IOException{
        Client.switchToRegistrationPage();
    }
}
