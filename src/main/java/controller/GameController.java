package controller;


import controller.model.Gomb;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;

import controller.Game2Controller;


@Slf4j
public class GameController {
    @FXML
    private Button gomb_1;
    @FXML
    private Button gomb_2;
    @FXML
    private Button gomb_3;
    @FXML
    private Button gomb_4;
    @FXML
    private Button gomb_5;
    @FXML
    private Button gomb_6;
    @FXML
    private Button gomb_7;
    @FXML
    private Button gomb_8;
    @FXML
    private Button gomb_9;
    @FXML
    private Button gomb_10;
    @FXML
    private Button gomb_11;
    @FXML
    private Button gomb_12;

    @FXML
    private Label kezdo;

    private String player1;
    private String player2;

    @FXML
    TextField p1Textfield;
    @FXML
    TextField p2Textfield;

    @FXML
    Button elso;

    int kezdok[] = {1, 5, 6, 4, 8, 6, 4, 3, 1, 2, 2, 8};
    ArrayList<Integer> lanc = new ArrayList<Integer>();

    public void nyitAction(ActionEvent actionEvent) throws Exception {
        String gomb = ((Button) actionEvent.getSource()).getId();
        String [] tomb = gomb.split("_");
        //System.out.println(tomb[1]);
        int sorszam = Integer.parseInt(tomb[1]);
        //System.out.println(kezdok[sorszam-1]);
        int [] tomb2 = {};
        int db = 0;
        for(int i = sorszam; i < kezdok.length; i++){
            lanc.add(kezdok[i]);
        }
        for (int j = 0; j < sorszam-1; j++){
            lanc.add(kezdok[j]);
        }

        System.out.println(lanc);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game2.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<Game2Controller>getController().initdatap1(player1);
        fxmlLoader.<Game2Controller>getController().initdatap2(player2);

        fxmlLoader.<Game2Controller>getController().p1_pont.setText(((Button) actionEvent.getSource()).getText());
        fxmlLoader.<Game2Controller>getController().p2_pont.setText("0");
        fxmlLoader.<Game2Controller>getController().uj_1.setText(String.valueOf(lanc.get(0)));
        fxmlLoader.<Game2Controller>getController().uj_2.setText(String.valueOf(lanc.get(1)));
        fxmlLoader.<Game2Controller>getController().uj_3.setText(String.valueOf(lanc.get(2)));
        fxmlLoader.<Game2Controller>getController().uj_4.setText(String.valueOf(lanc.get(3)));
        fxmlLoader.<Game2Controller>getController().uj_5.setText(String.valueOf(lanc.get(4)));
        fxmlLoader.<Game2Controller>getController().uj_6.setText(String.valueOf(lanc.get(5)));
        fxmlLoader.<Game2Controller>getController().uj_7.setText(String.valueOf(lanc.get(6)));
        fxmlLoader.<Game2Controller>getController().uj_8.setText(String.valueOf(lanc.get(7)));
        fxmlLoader.<Game2Controller>getController().uj_9.setText(String.valueOf(lanc.get(8)));
        fxmlLoader.<Game2Controller>getController().uj_10.setText(String.valueOf(lanc.get(9)));
        fxmlLoader.<Game2Controller>getController().uj_11.setText(String.valueOf(lanc.get(10)));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();

    }
    public void initdata(String player1) {
        this.player1 = player1;
        kezdo.setText("Kezdő játékos: " + this.player1);
    }

    public void initdata2(String player2) {
        this.player2 = player2;

    }


}
