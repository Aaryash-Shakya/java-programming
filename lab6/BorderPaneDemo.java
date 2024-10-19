import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class BorderPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bp = new BorderPane();
        bp.setTop(new Label("This will be at top"));
        bp.setLeft(new Label("This will be at left"));
        bp.setRight(new Label("This will be at right"));
        bp.setCenter(new Label("This will be at center"));
        bp.setBottom(new Label("This will be at bottom"));
        
        Scene scene = new Scene(bp, 600, 400);
        primaryStage.setTitle("BorderPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
