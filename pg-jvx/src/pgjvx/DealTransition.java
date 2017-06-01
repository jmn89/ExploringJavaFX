package pgjvx;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.image.ImageView;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
//@author jmn89

public class DealTransition {

    private static PathTransition pt;

    public DealTransition(ImageView flyCard, ImageView p2c1) {
        
        p2c1.setVisible(false);
        
        pt = new PathTransition();
        Path path = new Path();
        //start coordinate, at which the CENTER* of the node is placed
        //(0,0) == TOP LEFT of the NODE you move, hence the calcs below to find *CENTER
        path.getElements().add(new MoveTo(flyCard.getX() + (flyCard.getFitWidth() / 2), flyCard.getY() + (flyCard.getFitHeight() / 2)));
        //translation values, at which the BOTTOM RIGHT of the node is placed
        Bounds bound1 = flyCard.localToScreen(flyCard.getBoundsInLocal());
        Bounds bound2 = p2c1.localToScreen(p2c1.getBoundsInLocal());
        double distx = bound2.getMinX() - bound1.getMinX() + (flyCard.getFitWidth() / 2);
        double disty = bound2.getMinY() - bound1.getMinY() + (flyCard.getFitHeight() / 2);
        path.getElements().add(new LineTo(distx, disty));

        pt.setDuration(javafx.util.Duration.millis(500.0));
        pt.setNode(flyCard);
        pt.setPath(path);

        pt.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                p2c1.setVisible(true);
                flyCard.setVisible(false);
                flyCard.setLayoutX(79.0);
                flyCard.setLayoutY(166.0);
                flyCard.setVisible(true);
            }

        });

    }

    public static void go() {
        pt.play();
    }

}
