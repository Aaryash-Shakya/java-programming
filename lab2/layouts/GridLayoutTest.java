import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("GridLayout Test");
        frame.setSize(500,400);

        GridLayout layout = new GridLayout(2,3);
        frame.setLayout(layout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));
        
        frame.setVisible(true);
    }

}