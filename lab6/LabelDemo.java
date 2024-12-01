import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LabelDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        VBox vbox = new VBox(label, textField);
        vbox.setSpacing(10);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Label Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
