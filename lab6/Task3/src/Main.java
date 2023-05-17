import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Task3");
        MyPanel p = new MyPanel();
        f.setContentPane(p);
        f.setSize(500,500);
        f.setVisible(true);
    }
}