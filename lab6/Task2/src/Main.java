import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        MyPanel p = new MyPanel();
        f.setTitle("Task 2");
        f.setContentPane(p);
        f.setSize(400,300);
        f.setVisible(true);

    }
}
