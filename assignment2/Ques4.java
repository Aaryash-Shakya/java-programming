import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques4 extends JFrame {
    private JTextField tf1, tf2, tf3;
    private JButton button;
    private JLabel resultLabel;

    public Ques4() {
        setTitle("Sum Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        tf1 = new JTextField("Principal", 10);
        tf2 = new JTextField("Time", 10);
        tf3 = new JTextField("Rate", 10);
        button = new JButton("Calculate");
        resultLabel = new JLabel();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(tf1.getText());
                int t = Integer.parseInt(tf2.getText());
                double r = Double.parseDouble(tf3.getText());
                double si = (p + t + r) / 100;
                resultLabel.setText("Simple Interest: " + si);
            }
        });

        add(tf1);
        add(tf2);
        add(tf3);
        add(button);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ques4();
    }
}
