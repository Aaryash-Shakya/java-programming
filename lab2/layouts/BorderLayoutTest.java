import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest {
    public static void main(String args[]) {
        JButton btnNorth, btnEast, btnWest, btnSouth, btnCenter;
        JFrame frame;

        btnNorth = new JButton("North");
        btnEast = new JButton("East");
        btnWest = new JButton("West");
        btnSouth = new JButton("South");
        btnCenter = new JButton("Center");

        frame = new JFrame();
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnCenter, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}