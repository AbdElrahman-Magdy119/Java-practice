import java.util.Stack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class lab extends Application {

        StackPane rootpane;
        Rectangle r;
    @Override
    public void init() {
        r = new Rectangle(0,0,400,300);
        Text label = new Text("My name is Abdelrahman");
        label.setId("t1");
        Reflection R = new Reflection();
        label.setEffect(R);
        r.setId("r1");
        rootpane = new StackPane(r, label);
    }



    @Override
    public void start(Stage stage) throws Exception{
        Scene scene = new Scene(rootpane,400,300);
         scene.getStylesheets().add(getClass().getResource("style.css").toString());
         r.getStyleClass().add("mystyle");
        stage.setScene(scene);
        stage.initStyle(StageStyle.DECORATED);
       stage.show();
    }
 

}