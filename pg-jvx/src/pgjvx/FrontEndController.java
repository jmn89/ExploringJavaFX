package pgjvx;
//@author sw89

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableListValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import java.util.*;

public class FrontEndController implements Initializable {

    @FXML
    private ImageView flyCard;
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
    private Rectangle shape1P1;
    @FXML
    private Rectangle shape2P1;
    @FXML
    private Label labelNameP1;
    @FXML
    private Label labelPctP1;
    @FXML
    private Label labelCCP1;
    @FXML
    private ImageView dButP1;
    @FXML
    private ImageView c1P1;
    @FXML
    private ImageView c2P1;
    @FXML
    private Rectangle shape1P6;
    @FXML
    private Rectangle shape2P11;
    @FXML
    private Label labelNameP11;
    @FXML
    private Label labelPctP11;
    @FXML
    private Label labelCCP11;
    @FXML
    private ImageView dButP11;
    @FXML
    private ImageView c1P11;
    @FXML
    private ImageView c2P11;
    @FXML
    private Rectangle shape1P11;
    @FXML
    private Rectangle shape2P12;
    @FXML
    private Label labelNameP12;
    @FXML
    private Label labelPctP12;
    @FXML
    private Label labelCCP12;
    @FXML
    private ImageView dButP12;
    @FXML
    private ImageView c1P12;
    @FXML
    private ImageView c2P12;
    @FXML
    private Rectangle shape1P111;
    @FXML
    private Rectangle shape2P121;
    @FXML
    private Label labelNameP121;
    @FXML
    private Label labelPctP121;
    @FXML
    private Label labelCCP121;
    @FXML
    private ImageView dButP121;
    @FXML
    private ImageView c1P121;
    @FXML
    private ImageView c2P121;
    @FXML
    private Rectangle shape1P112;
    @FXML
    private Rectangle shape2P122;
    @FXML
    private Label labelNameP122;
    @FXML
    private Label labelPctP122;
    @FXML
    private Label labelCCP122;
    @FXML
    private ImageView dButP122;
    @FXML
    private ImageView c1P122;
    @FXML
    private ImageView c2P122;
    @FXML
    private Rectangle shape1P1121;
    @FXML
    private Rectangle shape2P1221;
    @FXML
    private Label labelNameP1221;
    @FXML
    private Label labelPctP1221;
    @FXML
    private Label labelCCP1221;
    @FXML
    private ImageView dButP1221;
    @FXML
    private ImageView c1P1221;
    @FXML
    private ImageView c2P1221;
    @FXML
    private Rectangle shape1P11211;
    @FXML
    private Rectangle shape2P12211;
    @FXML
    private Label labelNameP12211;
    @FXML
    private Label labelPctP12211;
    @FXML
    private Label labelCCP12211;
    @FXML
    private ImageView dButP12211;
    @FXML
    private ImageView c1P12211;
    @FXML
    private ImageView c2P12211;
    @FXML
    private Rectangle shape1P112111;
    @FXML
    private Rectangle shape2P122111;
    @FXML
    private Label labelNameP122111;
    @FXML
    private Label labelPctP122111;
    @FXML
    private Label labelCCP122111;
    @FXML
    private ImageView dButP122111;
    @FXML
    private ImageView c1P122111;
    @FXML
    private ImageView c2P122111;
    @FXML
    private Rectangle shape1P112112;
    @FXML
    private Rectangle shape2P122112;
    @FXML
    private Label labelNameP122112;
    @FXML
    private Label labelPctP122112;
    @FXML
    private Label labelCCP122112;
    @FXML
    private ImageView dButP122112;
    @FXML
    private ImageView c1P122112;
    @FXML
    private ImageView c2P122112;
    
    @FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //todo
        playerCount.getItems().addAll(2,3,5,9);
    }

    private void handleButtonAction(ActionEvent event) {                //unused so far

        System.out.println("You clicked me!");

        String s = playerCount.getValue().toString();
        int pCount = Integer.parseInt(s);

        Game game = new Game(pCount, flyCard);

        //DealTransition dt = new DealTransition(flyCard, flop1);
        //DealTransition.go();
    }

}
