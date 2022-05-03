import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * <p></p>
 * <p></p>
 *
 * @author: He Zhao
 * @create: 2022-04-29 20:56
 */
public class CH14E1 extends Application {
    public void start (Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        //images
        Image image1 = new Image("flag1.gif");
        Image image2 = new Image("flag2.gif");
        Image image3 = new Image("fr.gif");
        Image image4 = new Image("us.gif");

        //Setting up images to display
        ImageView ger = new ImageView(image1);
        ImageView china = new ImageView(image2);
        ImageView fr = new ImageView(image3);
        ImageView usa = new ImageView(image4);

        //Insert each flag into the grid
        pane.add(ger, 0, 0);
        pane.add(china, 0, 1);
        pane.add(fr, 1, 0);
        pane.add(usa, 1, 1);

        //Set up scene and stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Four Flags");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
