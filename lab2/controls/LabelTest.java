import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");

        frame.getContentPane().add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
