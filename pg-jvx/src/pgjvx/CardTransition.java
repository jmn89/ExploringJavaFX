package pgjvx;
//@author jmn89 <joshnappin@gmail.com>

import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.image.ImageView;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class CardTransition {

    private PathTransition pt;

    public CardTransition(ImageView flyCard, ImageView destinationCard) {
        
        pt = new PathTransition();
        destinationCard.setVisible(false);
       
        double flyCardOriginalXCods = flyCard.getLayoutX();
        double flyCardOriginalYCods = flyCard.getLayoutY();

        //start cods
        Path travelPath = new Path();
        travelPath.getElements().add(new MoveTo(flyCard.getX() + (flyCard.getFitWidth() / 2),
                flyCard.getY() + (flyCard.getFitHeight() / 2)));

        //destination cods
        Bounds bound1 = flyCard.localToScreen(flyCard.getBoundsInLocal());
        Bounds bound2 = destinationCard.localToScreen(destinationCard.getBoundsInLocal());
        double distx = bound2.getMinX() - bound1.getMinX() + (flyCard.getFitWidth() / 2);
        double disty = bound2.getMinY() - bound1.getMinY() + (flyCard.getFitHeight() / 2);
        travelPath.getElements().add(new LineTo(distx, disty));

        //create the transition with now complete travelPath
        pt.setDuration(javafx.util.Duration.millis(500.0));
        pt.setNode(flyCard);
        pt.setPath(travelPath);

        pt.setOnFinished((ActionEvent e) -> {
            destinationCard.setVisible(true);
            flyCard.setVisible(false);
            flyCard.setLayoutX(flyCardOriginalXCods);
            flyCard.setLayoutY(flyCardOriginalYCods);
            flyCard.setVisible(true);
        });
    }
    
    public void go() {
        pt.play();
    }
}
