import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagLayoutTest {

    public static void main() {
        JFrame frame;
        JButton btn1, btn2;
        JPanel panel;
        GridBagConstraints gbc;

        frame = new JFrame("GridBagLayout Test");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setPreferredSize(new Dimension(200, 300));

        frame.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(btn1, gbc);
        frame.add(btn2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(panel, gbc);

        frame.setVisible(true);

    }
}