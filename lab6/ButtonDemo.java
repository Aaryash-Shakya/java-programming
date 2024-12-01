import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Click Me");

        RadioButton radioButton1 = new RadioButton("Option 1");
        RadioButton radioButton2 = new RadioButton("Option 2");
        ToggleGroup radioGroup = new ToggleGroup();
        radioButton1.setToggleGroup(radioGroup);
        radioButton2.setToggleGroup(radioGroup);

        CheckBox checkBox1 = new CheckBox("CheckBox 1");
        CheckBox checkBox2 = new CheckBox("CheckBox 2");

        VBox vbox = new VBox(10, button, radioButton1, radioButton2, checkBox1, checkBox2);
        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Button Demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
