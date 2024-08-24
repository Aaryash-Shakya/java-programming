import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo extends Frame implements ActionListener {
    TextField tf;

    ActionListenerDemo() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("Click me");
        b.setBounds(100, 120, 80, 30);

        // register listener
        b.addActionListener(this);

        // add components and set size, layout and visibility
        add(b);
        add(tf);
        setSize(300, 300);
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new ActionListenerDemo();
    }
}
