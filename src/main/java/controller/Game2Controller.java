package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.awt.*;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.awt.*;
import java.util.ArrayList;

public class Game2Controller {


    @FXML
    Label p1;
    @FXML
    Label p2;

    @FXML
    Label p1_pont;

    @FXML
    Label p2_pont;

    @FXML
    Button uj_1;
    @FXML
    Button uj_2;
    @FXML
    Button uj_3;
    @FXML
    Button uj_4;
    @FXML
    Button uj_5;
    @FXML
    Button uj_6;
    @FXML
    Button uj_7;
    @FXML
    Button uj_8;
    @FXML
    Button uj_9;
    @FXML
    Button uj_10;
    @FXML
    Button uj_11;

    Button gomb;

    @FXML
    private String currentPlayer;

    @FXML
    private String play1;
    @FXML
    private String play2;


    public void gameAction(ActionEvent actionEvent){
        gomb = (Button)actionEvent.getSource();
        gomb.getText();

        System.out.println(gomb.getId());
        gomb.setVisible(false);
        if(currentPlayer.equals(play1)){
            p1.setTextFill(javafx.scene.paint.Color.BLACK);
            p2.setTextFill(javafx.scene.paint.Color.GREEN);
            currentPlayer = play2;
            int ertek = Integer.parseInt(p1_pont.getText()) + Integer.parseInt(gomb.getText());
            p1_pont.setText(Integer.toString(ertek));
        }
        else{
            p2.setTextFill(javafx.scene.paint.Color.BLACK);
            p1.setTextFill(javafx.scene.paint.Color.GREEN);
            currentPlayer = play1;
            int ertek = Integer.parseInt(p2_pont.getText()) + Integer.parseInt(gomb.getText());
            p2_pont.setText(Integer.toString(ertek));
        }
        //switchPlayer();
    }


    public void initdatap1(String play1) {
        this.play1 = play1;
        p1.setText(this.play1);
        p1.setTextFill(javafx.scene.paint.Color.BLACK);
    }

    public void initdatap2(String play2) {
        this.play2 = play2;
        this.currentPlayer = play2;
        p2.setText(this.play2);
        p2.setTextFill(javafx.scene.paint.Color.GREEN);

    }



    private void switchPlayer() {
        if (currentPlayer.equals(play1)) {
            currentPlayer = play2;
            p1.setTextFill(javafx.scene.paint.Color.GREEN);
            p2.setTextFill(javafx.scene.paint.Color.BLACK);
        }
        else {
            currentPlayer = play1;
            p2.setTextFill(javafx.scene.paint.Color.GREEN);
            p1.setTextFill(Color.BLACK);
        }
    }



}
