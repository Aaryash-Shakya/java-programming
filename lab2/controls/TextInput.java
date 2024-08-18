import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextInput {
    public static void main(String[] args) {
        JFrame f = new JFrame("TextField Example");
        
        JTextField t1 = new JTextField("Hello there");
        t1.setBounds(50, 50, 200, 30);
        
        JPasswordField t2 = new JPasswordField("Password");
        t2.setBounds(50, 100, 200, 30);
        
        JTextArea t3 = new JTextArea(5, 10);
        t3.setBounds(50, 150, 200, 100);

        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
