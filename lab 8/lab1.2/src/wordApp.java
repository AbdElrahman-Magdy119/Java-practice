import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class wordApp extends JFrame{
    private JTextArea textArea1;
    public JPanel panel1;
    private JButton wordsButton;
    private JButton lettersButton;
public wordApp() {
    wordsButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String[] t = textArea1.getText().split("/n");
            int count=0;

            for (String s : t){
                count+= s.split(" ").length;
                count++;
            }
            Integer words = t.length-1;
            JOptionPane.showMessageDialog(null,count,"Letters count : ",JOptionPane.INFORMATION_MESSAGE);
        }
    });
    lettersButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String t = textArea1.getText();
            Integer words = t.length();
            JOptionPane.showMessageDialog(null,words,"Letters count : ",JOptionPane.INFORMATION_MESSAGE);
        }
    });
}
}
