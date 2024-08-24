import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowEvents extends JFrame {
    public WindowEvents() {
        // Create a label to display a message
        JLabel label = new JLabel("Default", JLabel.CENTER);
        add(label);

        // Add window event handler
        addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                label.setText("Window Opened!");
            }
            public void windowClosed(WindowEvent e) {
                label.setText("Window Closed!");
            }
            public void windowActivated(WindowEvent e) {
                label.setText("Window Activated!");
            }
            public void windowDeactivated(WindowEvent e) {
                label.setText("Window Deactivated!");
            }
        });

        // Basic window settings
        setTitle("Window Events");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new WindowEvents();
    }
}
