package pgjvx;

import javafx.geometry.Point2D;
import java.net.URL;
import java.time.Duration;
import javafx.scene.shape.Path;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;

/**
 *
 * @author sw89
 */
public class FrontEndController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private ImageView p2c1 = new ImageView();

    @FXML
    private ImageView flyCard = new ImageView();

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");

        Path path = new Path();

        //path.getElements().add(new MoveTo(cod1.getX(),cod1.getY()));
        //path.getElements().add(new LineTo(cod2.getX(), cod2.getY()));
        //start coordinate, at which the CENTER* of the node is placed
        //(0,0) == TOP LEFT of the NODE you move, hence the calcs below to find *CENTER
        path.getElements().add(new MoveTo(flyCard.getX() + (flyCard.getFitWidth() / 2), flyCard.getY() + (flyCard.getFitHeight() / 2)));
        //translation values, at which the BOTTOM RIGHT of the node is placed
        //path.getElements().add(new LineTo(flyCard.getX() / 2, flyCard.getY() / 2));

        Bounds bound1 = flyCard.localToScreen(flyCard.getBoundsInLocal());
        Bounds bound2 = p2c1.localToScreen(p2c1.getBoundsInLocal());
        double distx = bound2.getMinX() - bound1.getMinX() + (flyCard.getFitWidth()/2);
        double disty = bound2.getMinY() - bound1.getMinY() + (flyCard.getFitHeight()/2);
        
        path.getElements().add(new LineTo(distx, disty));

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(javafx.util.Duration.millis(500.0));
        pathTransition.setNode(flyCard);
        pathTransition.setPath(path);
        //pathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
        //pathTransition.setCycleCount((int) 4f);
        //pathTransition.setAutoReverse(true);
        pathTransition.play();
        p2c1.setVisible(true);
    }

}
