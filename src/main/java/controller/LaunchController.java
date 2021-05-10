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


@Slf4j
public class LaunchController {

    @FXML
    TextField player1Textfield;
    @FXML
    TextField player2Textfield;

    @FXML
    private Label errorLabelP1;
    @FXML
    private Label errorLabelP2;
    

    public void startAction(ActionEvent actionEvent) throws Exception {

        if (player1Textfield.getText().isEmpty()) {
            errorLabelP1.setText("Player1 is empty!");
        }
        else {
            errorLabelP1.setText("");
        }
        if (player2Textfield.getText().isEmpty()) {
            errorLabelP2.setText("Player2 is empty!");
        }
        else {
            errorLabelP2.setText("");
        }

        if (!player1Textfield.getText().isEmpty() && !player2Textfield.getText().isEmpty()){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<GameController>getController().initdata(player1Textfield.getText());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        }

    }



}
