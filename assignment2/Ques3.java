import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ques3 extends JFrame {
    private JButton palindromeBtn, reverseBtn, vowelBtn;

    String reverseString(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        String revStr = "";
        for (int i = len - 1; i >= 0; i--) {
            revStr += arr[i];
        }
        return revStr;
    }

    boolean checkPalindrome(String s) {
        String revStr = reverseString(s);
        if (s.equals(revStr)) {
            return true;
        }
        return false;
    }

    String findVowel(String s){
        char[] arr = s.toCharArray();
        char[] vowels = {'a','e','i','o','u'};

        String vowelStr = "";
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<vowels.length;j++){
                if(arr[i] == vowels[j]){
                    vowelStr += arr[i];
                }
            }
        }
        return vowelStr;
    }

    public Ques3() {
        setTitle("String Operations");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new  JLabel("Input any string");

        JTextField tf = new JTextField(10);
        palindromeBtn = new JButton("Check Palindrome");
        reverseBtn = new JButton("Reverse String");
        vowelBtn = new JButton("Find Vower");
        JLabel resultLabel = new JLabel();

        palindromeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = tf.getText();
                if (checkPalindrome(str))
                    resultLabel.setText("Palindrome");
                else
                    resultLabel.setText("Not Palindrome");
            }
        });

        reverseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = tf.getText();
                resultLabel.setText(reverseString(str));
            }
        });
        
        vowelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = tf.getText();
                resultLabel.setText(findVowel(str));
            }
        });

        add(label);
        add(tf);
        add(palindromeBtn);
        add(reverseBtn);
        add(vowelBtn);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ques3();
    }
}
