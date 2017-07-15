package pgjvx;
//@author sw89
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

public class FrontEndController implements Initializable {

    /*
    @FXML
    private ImageView flyCard = new ImageView();
    */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //todo
        
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {                //unused so far
        System.out.println("You clicked me!");
        //DealTransition dt = new DealTransition(flyCard, flop1);
        //DealTransition.go();
    }

}
