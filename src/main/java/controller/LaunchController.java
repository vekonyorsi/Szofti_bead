package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class LaunchController {

    @FXML
    private TextField player1Textfield;
    @FXML
    private TextField player2Textfield;

    @FXML
    private Label errorLabelP1;
    @FXML
    private Label errorLabelP2;


    public void startAction(ActionEvent actionEvent) throws IOException {
        if (player1Textfield.getText().isEmpty()) {
            errorLabelP1.setText("Player1 is empty!");
        }
        if (player2Textfield.getText().isEmpty()) {
            errorLabelP2.setText("Player2 is empty!");
        }

    }
}
