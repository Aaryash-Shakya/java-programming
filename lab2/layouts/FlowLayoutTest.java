import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest {
    
    public static void main(String args[]){
        JFrame frame;
        JPanel pane1, pane2;
        JButton button;

        frame = new JFrame("Flow Layout Test");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pane1 = new JPanel();
        pane1.setPreferredSize(new Dimension(300, 100));
        pane1.setBackground(Color.BLUE);

        pane2 = new JPanel();
        pane2.setPreferredSize(new Dimension(200, 100));
        pane2.setBackground(Color.GREEN);

        button = new JButton("MY BUtton");
        button.setPreferredSize(new Dimension(100, 50));

        frame.setLayout(new FlowLayout());
        frame.add(pane1);
        frame.add(button);
        frame.add(pane2);
        frame.setVisible(true);
    }
}