import javax.swing.*;
import java.awt.*;

public class RadioAndCheckbox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio and Checkbox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        ButtonGroup radioGroup = new ButtonGroup();
        for (int i = 1; i <= 4; i++) {
            JRadioButton btn = new JRadioButton("Option " + i);
            radioGroup.add(btn);
            panel.add(btn);
        }

        for (int i = 1; i <= 4; i++) {
            JCheckBox checkBox = new JCheckBox("Check me " + i);
            panel.add(checkBox);
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}
