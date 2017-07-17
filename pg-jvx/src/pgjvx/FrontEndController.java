//@author sw89
package pgjvx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class FrontEndController implements Initializable {

// <editor-fold defaultstate="collapsed" desc="@FXML Declarations">
    @FXML
    private ButtonBar buttonBar;
    @FXML
    private ComboBox<Integer> playerCount;
    @FXML
    private Button runHand;
    @FXML
    private Button exit;
    @FXML
    private Button myButton;
    @FXML
    private Ellipse shapeTableOuter;
    @FXML
    private Ellipse shapeTableInner;
    @FXML
    private Label labelWinningHand;
    @FXML
    private Label labelTableTitle;
    @FXML
    private ImageView imgFlop1;
    @FXML
    private ImageView imgFlop2;
    @FXML
    private ImageView imgFlop3;
    @FXML
    private ImageView imgTurn;
    @FXML
    private ImageView imgRiver;
    @FXML
    private StackPane imgDeck;
    @FXML
    private ImageView imgFlyCard;
    @FXML
    private Rectangle shape2P1221;
    @FXML
    private Rectangle shape1S1;
    @FXML
    private Rectangle shape2S1;
    @FXML
    private Label labelNameS1;
    @FXML
    private Label labelPctS1;
    @FXML
    private Label labelCCS1;
    @FXML
    private ImageView dButS1;
    @FXML
    private ImageView c1S1;
    @FXML
    private ImageView c2S1;
    @FXML
    private Rectangle shape1S6;
    @FXML
    private Rectangle shape2S6;
    @FXML
    private Label labelNameS6;
    @FXML
    private Label labelPctS6;
    @FXML
    private Label labelCCS6;
    @FXML
    private ImageView dButS6;
    @FXML
    private ImageView c1S6;
    @FXML
    private ImageView c2S6;
    @FXML
    private Rectangle shape1S2;
    @FXML
    private Rectangle shape2S2;
    @FXML
    private Label labelNameS2;
    @FXML
    private Label labelPctS2;
    @FXML
    private Label labelCCS2;
    @FXML
    private ImageView dButS2;
    @FXML
    private ImageView c1S2;
    @FXML
    private ImageView c2S2;
    @FXML
    private Rectangle shape1S5;
    @FXML
    private Rectangle shape2S5;
    @FXML
    private Label labelNameS5;
    @FXML
    private Label labelPctS5;
    @FXML
    private Label labelCCS5;
    @FXML
    private ImageView dButS5;
    @FXML
    private ImageView c1S5;
    @FXML
    private ImageView c2S5;
    @FXML
    private Rectangle shape1S3;
    @FXML
    private Rectangle shape2S3;
    @FXML
    private Label labelPctS3;
    @FXML
    private Label labelCCS3;
    @FXML
    private ImageView dButS3;
    @FXML
    private ImageView c1S3;
    @FXML
    private ImageView c2S3;
    @FXML
    private Rectangle shape1S4;
    @FXML
    private Label labelNameS4;
    @FXML
    private Label labelPctS4;
    @FXML
    private Label labelCCS4;
    @FXML
    private ImageView dButS4;
    @FXML
    private ImageView c1S4;
    @FXML
    private ImageView c2S4;
    @FXML
    private Rectangle shape1S8;
    @FXML
    private Rectangle shape2S8;
    @FXML
    private Label labelNameS8;
    @FXML
    private Label labelPctS8;
    @FXML
    private Label labelCCS8;
    @FXML
    private ImageView dButS8;
    @FXML
    private ImageView c1S8;
    @FXML
    private ImageView c2S8;
    @FXML
    private Rectangle shape1S9;
    @FXML
    private Rectangle shape2S9;
    @FXML
    private Label labelNameS9;
    @FXML
    private Label labelPctS9;
    @FXML
    private Label labelCCS9;
    @FXML
    private ImageView dButS9;
    @FXML
    private ImageView c1S9;
    @FXML
    private ImageView c2S9;
    @FXML
    private Rectangle shape1S7;
    @FXML
    private Rectangle shape2S7;
    @FXML
    private Label labelNameS7;
    @FXML
    private Label labelPctS7;
    @FXML
    private Label labelCCS7;
    @FXML
    private ImageView dButS7;
    @FXML
    private ImageView c1S7;
    @FXML
    private ImageView c2S7;
    @FXML
    private Label labelNameS3;
// </editor-fold>

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        playerCount.getItems().addAll(2, 3, 5, 9);
        playerCount.getSelectionModel().selectLast();

        Image i2 = new Image(getClass().getResource("imgs/9Clubs.png").toExternalForm());
        c2S2.setImage(i2);
    }

    @FXML
    private void handleButtonActionRun(ActionEvent event) {
        System.out.println("You clicked me!");
        GuiCollection gC = new GuiCollection();
        // <editor-fold defaultstate="collapsed" desc=" ADDING TO GUI COLLECTION ">
        gC.addToCards(imgFlyCard);
        gC.addToCards(imgFlop1);
        gC.addToCards(imgFlop2);
        gC.addToCards(imgFlop3);
        gC.addToCards(imgTurn);
        gC.addToCards(imgRiver);
        gC.addToCards(c1S1);
        gC.addToCards(c1S2);
        gC.addToCards(c1S3);
        gC.addToCards(c1S4);
        gC.addToCards(c1S5);
        gC.addToCards(c1S6);
        gC.addToCards(c1S7);
        gC.addToCards(c1S8);
        gC.addToCards(c1S9);
        gC.addToCards(c2S1);
        gC.addToCards(c2S2);
        gC.addToCards(c2S3);
        gC.addToCards(c2S4);
        gC.addToCards(c2S5);
        gC.addToCards(c2S6);
        gC.addToCards(c2S7);
        gC.addToCards(c2S8);
        gC.addToCards(c2S9);
        gC.addToDealerButtons(dButS1);
        gC.addToDealerButtons(dButS2);
        gC.addToDealerButtons(dButS3);
        gC.addToDealerButtons(dButS4);
        gC.addToDealerButtons(dButS5);
        gC.addToDealerButtons(dButS6);
        gC.addToDealerButtons(dButS7);
        gC.addToDealerButtons(dButS8);
        gC.addToDealerButtons(dButS9);
        gC.addToLabelsTitles(labelNameS1);
        gC.addToLabelsTitles(labelNameS2);
        gC.addToLabelsTitles(labelNameS3);
        gC.addToLabelsTitles(labelNameS4);
        gC.addToLabelsTitles(labelNameS5);
        gC.addToLabelsTitles(labelNameS6);
        gC.addToLabelsTitles(labelNameS7);
        gC.addToLabelsTitles(labelNameS8);
        gC.addToLabelsTitles(labelNameS9);
        gC.addToLabelsTitles(labelTableTitle);
        gC.addToLabelsTitles(labelWinningHand);
        gC.addToLabelsCC(labelCCS1);
        gC.addToLabelsCC(labelCCS2);
        gC.addToLabelsCC(labelCCS3);
        gC.addToLabelsCC(labelCCS4);
        gC.addToLabelsCC(labelCCS5);
        gC.addToLabelsCC(labelCCS6);
        gC.addToLabelsCC(labelCCS7);
        gC.addToLabelsCC(labelCCS8);
        gC.addToLabelsCC(labelCCS9);
        gC.addToLabelsPct(labelPctS1);
        gC.addToLabelsPct(labelPctS2);
        gC.addToLabelsPct(labelPctS3);
        gC.addToLabelsPct(labelPctS4);
        gC.addToLabelsPct(labelPctS5);
        gC.addToLabelsPct(labelPctS6);
        gC.addToLabelsPct(labelPctS7);
        gC.addToLabelsPct(labelPctS8);
        gC.addToLabelsPct(labelPctS9);

// </editor-fold>
        int pCount = Integer.parseInt(playerCount.getValue().toString());
        Game game = new Game(pCount, gC);
        game.dealNewHand(gC);

    }

}
