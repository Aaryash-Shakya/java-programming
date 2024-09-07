import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Movie {
    int id;
    String title;
    String genre;
    String language;
    int length;

    public Movie(int id, String title, String genre, String language, int length) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.length = length;
    }

    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", length=" + length +
                '}';
    }
}

public class Ques2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Movie Rental System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2));

        // Labels and Text Fields
        JLabel idLabel = new JLabel("ID:");
        JTextField idField = new JTextField();

        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField();

        JLabel genreLabel = new JLabel("Genre:");
        JTextField genreField = new JTextField();

        JLabel languageLabel = new JLabel("Language:");
        JTextField languageField = new JTextField();

        JLabel lengthLabel = new JLabel("Length (minutes):");
        JTextField lengthField = new JTextField();

        // OK Button
        JButton okButton = new JButton("OK");

        frame.add(idLabel);
        frame.add(idField);
        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(genreLabel);
        frame.add(genreField);
        frame.add(languageLabel);
        frame.add(languageField);
        frame.add(lengthLabel);
        frame.add(lengthField);
        frame.add(okButton);

        // OK Button Action Listener
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int id = Integer.parseInt(idField.getText());
                    String title = titleField.getText();
                    String genre = genreField.getText();
                    String language = languageField.getText();
                    int length = Integer.parseInt(lengthField.getText());

                    Movie movie = new Movie(id, title, genre, language, length);
                    JOptionPane.showMessageDialog(frame, "Movie added: " + movie);
                    
                    // Clear fields after insertion
                    idField.setText("");
                    titleField.setText("");
                    genreField.setText("");
                    languageField.setText("");
                    lengthField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid data.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
