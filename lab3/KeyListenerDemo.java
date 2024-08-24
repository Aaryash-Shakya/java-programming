import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerDemo extends JFrame {
    public KeyListenerDemo() {
        // Create a label to display a message
        JLabel label = new JLabel("Press any key", JLabel.CENTER);
        add(label);

        // Add a KeyAdapter to handle key events
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }
        });

        // Basic window settings
        setTitle("KeyListener Demo");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyListenerDemo();
    }
}
