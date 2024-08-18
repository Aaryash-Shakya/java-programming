import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DialogTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dialog Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me");
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "This is a dialog message.");
        });

        frame.getContentPane().add(button);
        frame.pack();
        frame.setVisible(true);
    }
}
