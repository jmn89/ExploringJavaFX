package pgjvx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

/**
 *
 * @author sw89
 */
public class FrontEndController implements Initializable {

    @FXML
    private ImageView p2c1 = new ImageView();
    @FXML
    private ImageView flyCard = new ImageView();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //todo
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        DealTransition dt = new DealTransition(flyCard, p2c1);
        DealTransition.go();
    }

}
