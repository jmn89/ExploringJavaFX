package pgjvx;
//@author sw89

import java.util.ArrayList;

class Player {

    private int SeatNum;
    private boolean inGame;
    private Card c1;
    private Card c2;
    private double chipCount;
    private boolean inHand;
    private final String name;

    public Player(int seatNum2, String name2) {
        this.SeatNum = seatNum2;
        this.name = name2;
        this.inGame = true;
    }
    
    //getters and setters
    public void setSeatNum(int SeatNum) {
        this.SeatNum = SeatNum;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public void setC1(Card c1) {
        this.c1 = c1;
    }

    public void setC2(Card c2) {
        this.c2 = c2;
    }

    public void setChipCount(double chipCount) {
        this.chipCount = this.chipCount + chipCount;
    }

    public void setInHand(boolean inHand) {
        this.inHand = inHand;
    }
}
