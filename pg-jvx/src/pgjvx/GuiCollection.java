package pgjvx;
//@author jmn89 <joshnappin@gmail.com>

import java.io.File;
import java.util.ArrayList;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GuiCollection {

    private ArrayList<ImageView> cards;
    private ArrayList<ImageView> dealerButtons;
    private ArrayList<Label> labelsTitles;
    private ArrayList<Label> labelsCC;
    private ArrayList<Label> labelsPct;

    public GuiCollection() {
        this.cards = new ArrayList();
        this.dealerButtons = new ArrayList();
        this.labelsTitles = new ArrayList();
        this.labelsCC = new ArrayList();
        this.labelsPct = new ArrayList();
    }

    public void addToCards(ImageView v) {
        this.cards.add(v);
    }

    public ImageView getCard(int i) {
        return cards.get(i);
    }   
    
    public void setCardImage(int t, Card c) {
        String s = "imgs/" + c.getCardValue() + c.getSuitAsString(c.getCardSuit()) + ".png";
        Image i = new Image(this.getClass().getResource(s).toExternalForm());
        this.cards.get(t).setImage(i);
    }
    
    public void setCardImage(int i, Image t) {
        this.cards.get(i).setImage(t);
    }

    public void addToDealerButtons(ImageView v) {
        this.dealerButtons.add(v);
    }

    public void addToLabelsTitles(Label l) {
        this.labelsTitles.add(l);
    }

    public void setLabelTitle(int i, String s) {
        this.labelsTitles.get(i).setText(s);
    }

    public Label getLabelsTitles(int i) {
        return this.labelsTitles.get(i);
    }

    public void setLabelCC(int i, String s) {
        this.labelsCC.get(i).setText(s);
    }

    public Label getLabelsCC(int i) {
        return this.labelsCC.get(i);
    }

    public Label getLabelsPct(int i) {
        return this.labelsPct.get(i);
    }

    public void addToLabelsCC(Label l) {
        this.labelsCC.add(l);
    }

    public void addToLabelsPct(Label l) {
        this.labelsPct.add(l);
    }

    public ArrayList<ImageView> getCardArray() {
        return cards;
    }

    public ImageView getDealerButton(int i) {
        return dealerButtons.get(i);
    }

    public Label getLabels(int i) {
        return labelsTitles.get(i);
    }

    public void initiateTableInfo(ArrayList pList) {

    }
}
