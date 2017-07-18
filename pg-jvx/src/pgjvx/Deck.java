package pgjvx;
//@author jmn89 <joshnappin@gmail.com>

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javafx.animation.SequentialTransition;
import javafx.scene.image.ImageView;

class Deck {

    private ArrayList<Card> theDeck;
    private double deckCodX;
    private double deckCodY;
    private ImageView burnPile;

    public Deck() {

        this.theDeck = new ArrayList();
        this.populateDeck();
        this.shuffle();
    }

    private void populateDeck() {
        //fill deck with cards
        char[] c = {'s', 'c', 'h', 'd', 'j'};
        for (int s = 0; s <= 3; s++) {
            for (int v = 2; v <= 14; v++) {
                char r = c[s];
                Card newCard = new Card(v, r);
                this.theDeck.add(newCard);
            }
        }
    }

    private void shuffle() {

        if (theDeck.size() == 52) {

            int d = 51;
            for (int i = d; i > 0; i--) {

                int randomNum = ThreadLocalRandom.current().nextInt(0, 51);
                Card temp = theDeck.get(i);
                theDeck.set(i, theDeck.get(randomNum));
                theDeck.set(randomNum, temp);
            }

        } else {
            System.out.println("ERROR - Cannot Shuffle; Card Count != 52 \n");
        }
    }

    public Card dealCard(ArrayList<ImageView> a, int guiDestinationIndex) {

        Card c = new Card();

        if (theDeck.isEmpty() != true) {
            c = theDeck.get(theDeck.size() - 1);
            theDeck.remove(theDeck.size() - 1);
            //ImageView iv = a.get(guiDestinationIndex);
            //CardTransition ct = new CardTransition(this.burnPile, iv);
            //ct.go();
            return c;
        } else {
            System.out.println("Error! Deck is Empty!\n");
            return null;
        }

    }

    public boolean deckOk() {

        System.out.println("Deck Size == " + theDeck.size() + "\n");

        int count = 0;
        char[] c = {'s', 'c', 'h', 'd', 'j'};

        for (int s = 0; s <= 3; s++) {
            for (int v = 2; v <= 14; v++) {

                char r = c[s];
                Card newCard = new Card(v, r);

                String k = newCard.getCardAsString();
                if (this.isInDeck(k)) {

                    System.out.println("Found..: " + k + "\n");
                    count++;
                }
            }
        }
        return count == 52;
    }

    private boolean isInDeck(String cardToFind) {
        int i = 0;
        String deckCard = this.theDeck.get(i).getCardAsString();

        while (i < theDeck.size() && !deckCard.equals(cardToFind)) {
            deckCard = this.theDeck.get(i).getCardAsString();
            i++;
        }

        if (!deckCard.equals(cardToFind)) {
            System.out.println("Couldn't Find Card! \n");
            return false;

        } else {
            return true;
        }
    }

    public void printDeck() {
        System.out.println("Printing Deck of Size: " + this.theDeck.size() + "\n");
        for (int i = 0; i < this.theDeck.size(); i++) {
            System.out.println(this.theDeck.get(i).getCardAsString());
        }
    }

    public void setBurnPile(ImageView flyC) {
        this.burnPile = flyC;
    }

    public ImageView getBurnPile() {
        return burnPile;
    }
}
