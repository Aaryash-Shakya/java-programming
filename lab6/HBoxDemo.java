import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox = new HBox();
        hbox.setSpacing(10);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        hbox.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(hbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HBox Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
