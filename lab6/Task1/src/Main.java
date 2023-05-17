import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Task 1");
        MyPanel p = new MyPanel();
        f.setContentPane(p);
        f.setSize(500,300);
        f.setVisible(true);
        p.run();
    }
}