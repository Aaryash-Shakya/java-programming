import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ItemEvents extends JFrame {
    public ItemEvents() {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Apple");
        comboBox.addItem("Ball");
        comboBox.addItem("Cat");
        
        comboBox.addItemListener(new ItemAdapter() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedOption = (String) comboBox.getSelectedItem();
                    System.out.println("Selected option: " + selectedOption);
                }
            }
        });
        
        add(comboBox);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ItemEvents();
    }
}

class ItemAdapter implements ItemListener {
    public void itemStateChanged(ItemEvent e) {
        // Default implementation, can be overridden
    }
}