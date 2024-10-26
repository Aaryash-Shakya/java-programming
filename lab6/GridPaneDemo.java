import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");

        // Adding buttons to the grid pane in a 2x2 layout
        gridPane.add(btn1, 0, 0);
        gridPane.add(btn2, 1, 0);
        gridPane.add(btn3, 0, 1);
        gridPane.add(btn4, 1, 1);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("GridPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
