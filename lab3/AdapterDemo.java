import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AdapterDemo extends JFrame {

    public AdapterDemo() {
        // Create a label to display a message
        JLabel label = new JLabel("Click anywhere in the window", JLabel.CENTER);
        add(label);

        // Add a MouseAdapter to handle mouse click events
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked!");
            }
        });

        // Basic window settings
        setTitle("Adapter Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterDemo();
    }
}
