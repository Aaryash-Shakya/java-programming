import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ScrollPane {
	public static void main(String args[]) {
		JFrame frame = new JFrame("JScrollPane");
		frame.setSize(300, 200);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		String categories[] = { "C/C++", ".NET", "Java", "HTML", "CSS", "JavaScript", "TypeScript", "React", "Express", "Python", "Ruby", "Rust" };
		JList<String> list = new JList<>(categories);

		JScrollPane scrollPane = new JScrollPane(list);

		frame.getContentPane().add(scrollPane);
		frame.setVisible(true);
	}
}
