package pgjvx;
//@author sw89

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javafx.scene.image.ImageView;

public class Game {
    
    private ArrayList<Player> playerList;
    private int plCount;
    private int buttonSeatNum;
    private Deck currentDeck;

    public Game(int pCount, ImageView flyCard) {

        this.plCount = pCount;
        this.buttonSeatNum = ThreadLocalRandom.current().nextInt(1, this.plCount);
        currentDeck = new Deck();
        currentDeck.setGuiCods(flyCard);
        
        for (int i = 0; i < pCount; i++) {
            String[] a = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9"};
            Player p = new Player(a[i]);
            playerList.add(p);
        }
        this.initiatePlayerInfoWithGUI();
        //create playerList of players in loop
        //set seat numbers according to pCount
        //
    }

    public void prepareNewHand() {
        
    }

    public void dealNewHand() {
        //player1.c1 = dealCard()    in loop
        //player1.c1.revealCards();  **
    }

    public void dealFlop() {

    }

    public void dealTurn() {

    }

    public void dealRiver() {

    }

    private void initiatePlayerInfoWithGUI() {
        
        if (this.plCount == 2) {
            
            
        }
    }

}
