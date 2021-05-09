package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;


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


    int kezdok[] =  {1, 5, 6, 4, 8, 6, 4, 3, 1, 2, 2, 8};
    ArrayList<Integer> lanc;

    public void nyitAction(ActionEvent actionEvent) throws Exception {
        String gomb = ((Button) actionEvent.getSource()).getId();
        String [] tomb = gomb.split("_");
        //System.out.println(tomb[1]);
        int sorszam = Integer.parseInt(tomb[1]);
        //System.out.println(kezdok[sorszam-1]);
        int [] tomb2 = {};
        int db = 0;
        for(int i = sorszam; i < kezdok.length; i++){
            //lanc.add(kezdok[i]);
            System.out.println(kezdok[i]);
        }
        for (int j = 0; j < sorszam-1; j++){
            //lanc.add(kezdok[j]);
            System.out.println(kezdok[j]);
        }

    }


}
