import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques5 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;
    private JLabel resultLabel;

    public Ques5() {
        setTitle("Product Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        button = new JButton("Calculate");
        resultLabel = new JLabel();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int product = num1 * num2;
                resultLabel.setText("Product: " + product);
            }
        });

        add(textField1);
        add(textField2);
        add(button);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ques5();
    }
}
