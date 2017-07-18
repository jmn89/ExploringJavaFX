package pgjvx;
//@author sw89

import java.awt.Image;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javafx.animation.SequentialTransition;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javax.swing.ImageIcon;

public class Game {

    private ArrayList<Player> playerList;
    private int plCount;
    private int currentButtonNum;
    private Deck currentDeck;

    public Game(int pCount, GuiCollection g) {

        this.plCount = pCount;
        this.currentButtonNum = ThreadLocalRandom.current().nextInt(1, this.plCount);
        currentDeck = new Deck();
        currentDeck.setBurnPile(g.getCard(0));

        playerList = new ArrayList();
        for (int i = 0; i < pCount; i++) {
            String[] a = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9"};
            Player p = new Player(a[i]);
            playerList.add(p);
        }
        this.prepareNewHand(g);

    }

    public void prepareNewHand(GuiCollection g) {

        for (int i = 0; i < this.plCount; i++) {
            g.setLabelTitle(i, playerList.get(i).getName());
            g.setLabelCC(i, playerList.get(i).getChipCountAsString());
        }
    }

    public void dealNewHand(GuiCollection g) {
        SequentialTransition sq = new SequentialTransition();
        //ct.go();
        for (int i = 6; i <= 14; i++) {
            int k2 = i - 6;
            this.playerList.get(k2).setC2(currentDeck.dealCard(g.getCardArray(), i));
            g.setCardImage(i, playerList.get(k2).getC2());
            ImageView iv = g.getCardArray().get(i);
            ImageView iv2 = currentDeck.getBurnPile();
            CardTransition ct = new CardTransition(iv2, iv);
            //ct.go();
            sq.getChildren().add(ct.getPathTransition());
        }
        sq.playFromStart();
    }

    public void dealFlop() {

    }

    public void dealTurn() {

    }

    public void dealRiver() {

    }
}
