import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("GridLayout Test");
        frame.setSize(500, 400);

        GridLayout layout = new GridLayout(2, 3);
        frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setVisible(true);
    }

}