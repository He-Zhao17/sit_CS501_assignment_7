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
        Image image1 = new Image("us_flag.gif");
        Image image2 = new Image("england_flag.gif");
        Image image3 = new Image("brazil_flag.gif");
        Image image4 = new Image("india_flag.gif");

        //Setting up images to display
        ImageView usa = new ImageView(image1);
        ImageView england = new ImageView(image2);
        ImageView brazil = new ImageView(image3);
        ImageView china = new ImageView(image4);

        //Insert each flag into the grid
        pane.add(usa, 0, 0);
        pane.add(england, 0, 1);
        pane.add(brazil, 1, 0);
        pane.add(china, 1, 1);

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
