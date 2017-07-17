package pgjvx;
//@author jmn89 <joshnappin@gmail.com>

import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {

    private final char cardSuit;
    private final int cardValue;
    //private final Image img;

    public Card(int v, char s) {
        this.cardSuit = s;
        this.cardValue = v;
    }

    public Card() {
        this.cardSuit = 'j';
        this.cardValue = 0;
        //this.img = new Image(getClass().getResource("imgs/0Joker.png").toExternalForm());
    }

    public String getSuitAsString(char s) {
        switch (s) {
            case 's':
                return "Spades";
            case 'c':
                return "Clubs";
            case 'h':
                return "Hearts";
            case 'd':
                return "Diamonds";
            case 'j':
                return "JOKER";
            default:
                return "CARD SUIT ERROR!";
        }
    }

    public String getSuitAsString() {
        switch (this.getCardSuit()) {
            case 's':
                return "Spades";
            case 'c':
                return "Clubs";
            case 'h':
                return "Hearts";
            case 'd':
                return "Diamonds";
            case 'j':
                return "JOKER";
            default:
                return "CARD SUIT ERROR!";
        }
    }

    public String getValAsString() {
        switch (this.cardValue) {
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                return "Ace";
            default:
                return String.valueOf(this.cardValue);
        }
    }

    public String getCardAsString() {
        return this.getValAsString() + " of " + this.getSuitAsString();
    }

    //getters + setters
    public char getCardSuit() {
        return cardSuit;
    }

    public int getCardValue() {
        return cardValue;
    }
    /*
    public Image getImg() {
        return img;
    }
     */

}
