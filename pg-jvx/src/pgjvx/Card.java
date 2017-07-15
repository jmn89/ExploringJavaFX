package pgjvx;
//@author jmn89 <joshnappin@gmail.com>

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;

public class Card {

    private final char cardSuit;
    private final int cardValue;
    private ImageIcon img = null;

    public Card(int v, char s) {
        this.cardSuit = s;
        this.cardValue = v;
        this.img = this.initiateImage(v, s);
    }

    public Card() {
        this.cardSuit = 'j';
        this.cardValue = 0;
        this.img = this.initiateImage(0, 'j');

    }

    private ImageIcon initiateImage(int v, char s) {

        String filePath = new File("src/pg-jvx/myimgpackage/"
                + this.cardValue + this.cardSuit + ".png").getAbsolutePath();
        Image i = new ImageIcon(filePath).getImage().getScaledInstance(90, 120, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(i);

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

    public ImageIcon getImg() {
        return img;
    }

}
