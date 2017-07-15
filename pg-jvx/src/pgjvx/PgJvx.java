package pgjvx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//@author jmn89

public class PgJvx extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("FrontEnd.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        Deck d = new Deck();
        if (d.deckOk() == true) {
            System.out.println("AOK" + "\n");
            System.out.println("Printing Deck in Actual Order..." + "\n");
            d.printDeck();
            //...you can now deal
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
