import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        wordApp app = new wordApp();
        app.setContentPane(app.panel1);
        app.setSize(400,400);
        app.setVisible(true);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}