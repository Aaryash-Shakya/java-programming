import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class Ques1 extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button;

    public Ques1() {
        setTitle("Sum Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField1 = new JTextField(10); 
        textField2 = new JTextField(10);
        button = new JButton("Calculate");
        textField3 = new JTextField(10);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                textField3.setText("Sum: " + sum);
            }
        });
        textField2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                textField3.setText("Sum: " + sum);
            }
        });

        add(textField1);
        add(textField2);
        add(textField3);
        add(button);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ques1();
    }
}
