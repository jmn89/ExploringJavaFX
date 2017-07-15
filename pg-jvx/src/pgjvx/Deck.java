package pgjvx;
//@author jmn89 <joshnappin@gmail.com>

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

class Deck {

    private ArrayList<Card> theDeck;

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

    public Card dealCard() {
        Card c = new Card();
        if (theDeck.isEmpty() != true) {
            c = theDeck.get(theDeck.size() - 1);
            theDeck.remove(theDeck.size() - 1);
        }
        return c;
    }

    public boolean deckOk() {
        //return true if card count and all cards are correct

        System.out.println("Deck Size == " + theDeck.size());

        int count = 0;
        char[] c = {'s', 'c', 'h', 'd', 'j'};

        for (int s = 0; s <= 3; s++) {
            for (int v = 2; v <= 14; v++) {

                char r = c[s];
                Card newCard = new Card(v, r);

                String k = newCard.getCardAsString();
                if (this.findCard(k)) {

                    System.out.println("Found..: " + k + "\n");
                    count++;
                }
            }
        }
        return count == 52;
    }

    private boolean findCard(String cardToFind) {
        int i = 0;
        String deckCard = this.theDeck.get(i).getCardAsString();

        while (i < theDeck.size() && !deckCard.equals(cardToFind)) {
            deckCard = this.theDeck.get(i).getCardAsString();
            i++;
        }

        if (!deckCard.equals(cardToFind)) {
            System.out.println("Couldn't Find Card!");
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

}
