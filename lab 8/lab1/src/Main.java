import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        IpFinder app = new IpFinder();
        app.setContentPane(app.panel1);
        app.setSize(500,500);
        app.setVisible(true);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}