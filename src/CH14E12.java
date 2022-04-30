import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import jdk.jfr.Category;

/**
 * <p></p>
 * <p></p>
 *
 * @author: He Zhao
 * @create: 2022-04-29 21:21
 */
public class CH14E12 extends Application {
    public void start (Stage stage) {
        stage.setTitle("CH14E12");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
        bc.setTitle("Grade Breakdown");
        yAxis.setLabel("Percent");

        XYChart.Series s1 = new XYChart.Series();
        s1.setName("Project");
        s1.getData().add(new XYChart.Data("Project", 20));

        XYChart.Series s2 = new XYChart.Series();
        s2.setName("Quiz");
        s2.getData().add(new XYChart.Data("Quiz", 10));

        XYChart.Series s3 = new XYChart.Series();
        s2.setName("Midterm");
        s2.getData().add(new XYChart.Data("Midterm", 30));

        XYChart.Series s4 = new XYChart.Series();
        s2.setName("Final");
        s2.getData().add(new XYChart.Data("Final", 40));

        Scene scene = new Scene(bc, 800, 600);
        bc.getData().addAll(s1, s2, s3, s4);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
