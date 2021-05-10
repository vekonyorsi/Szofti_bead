package controller.model;

import java.util.ArrayList;

public class Gomb {
    String player1;

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    String player2;

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    int alap[] =  {1, 5, 6, 4, 8, 6, 4, 3, 1, 2, 2, 8};

    public int[] getAlap() {
        return alap;
    }

    public void setAlap(int[] alap) {
        this.alap = alap;
    }

    ArrayList<Integer> alap_kor;

    public ArrayList<Integer> getAlap_kor() {
        return alap_kor;
    }

    public void setAlap_kor(ArrayList<Integer> alap_kor) {
        this.alap_kor = alap_kor;
    }



}
