

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Stack;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.scene.Group;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

import javafx.scene.text.Text;

import javafx.stage.StageStyle;

import javafx.event.Event;

import javafx.*;
import javafx.event.*;




public class jtest extends Application {

        String cutvalue="";
        String  copyvalue="";
        @Override
        public void start (Stage primaryStage) throws Exception {
                MenuBar bar = new MenuBar ();    
                Menu file = new Menu ("File");
                Separator s = new Separator();
                MenuItem newItem = new MenuItem("new");
                MenuItem openitem = new MenuItem("open");
                MenuItem saveItem = new MenuItem("save");
                MenuItem exitItem = new MenuItem("Exit");
                file.getItems().addAll(newItem,openitem,saveItem,exitItem);
                Menu Eidt = new Menu ("Eidt");
                MenuItem cutItem = new MenuItem("cut");
                MenuItem copyItem = new MenuItem("copy");
                MenuItem pasteItem = new MenuItem("paste");
                MenuItem deleteItem = new MenuItem("delete");
                Eidt.getItems().addAll(cutItem,copyItem,pasteItem,deleteItem);
                Menu help = new Menu ("help");
                MenuItem Aboutitem = new MenuItem("About notepad");
                help.getItems().addAll(Aboutitem);
                bar.getMenus().addAll(file,Eidt,help) ;
                TextArea t = new TextArea(); 
                BorderPane pane = new BorderPane () ;
                pane.setTop (bar);
                pane.setCenter(t);

                cutItem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                        cutvalue = t.getText();
                        t.clear();
                    }
                });
                copyItem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                        copyvalue = t.getText();
                    }
                });
                pasteItem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                       if(copyvalue != "")
                       {
                         t.appendText(copyvalue);
                         copyvalue = "";
                       }
                       else
                       {
                         t.appendText(cutvalue);
                         cutvalue = "";
                       }
                    }
                });
                deleteItem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                        t.replaceSelection("");
                    }
                });
                exitItem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                        int returnValue = 0;
                        JFrame frame = new JFrame("Notepad");
                        Object[] options = {"save","dont save","cancle"};
                        returnValue =  JOptionPane.showOptionDialog(frame,
                        "Do you want to save changes","Notepad",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,     
                        options, 
                        options[0]); 

                         if (returnValue == JOptionPane.YES_OPTION)
                            {
                                JFrame f = new JFrame("Main Window");
                                JOptionPane.showMessageDialog(f,
                                "Your changes saved successfully",
                                "Save",
                                JOptionPane.PLAIN_MESSAGE);
                                Platform.exit();
                            }
                         else if (returnValue == JOptionPane.NO_OPTION)
                                Platform.exit();
                        
                    }
                });
                saveItem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                                FileChooser j = new FileChooser();
                                File f = j.showSaveDialog(primaryStage);
                                JFrame frame = new JFrame("Main Window");
                                JOptionPane.showMessageDialog(frame,
                                "Your changes saved successfully",
                                "Save",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                });
                newItem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                        int returnValue = 0;
                        JFrame frame = new JFrame("Notepad");
                        Object[] options = {"save","dont save","cancle"};
                        returnValue =  JOptionPane.showOptionDialog(frame,
                        "Do you want to save changes","Notepad",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,     
                        options, 
                        options[0]); 

                         if (returnValue == JOptionPane.YES_OPTION)
                            {
                                JFrame f = new JFrame("Main Window");
                                JOptionPane.showMessageDialog(f,
                                "Your changes saved successfully",
                                "Save",
                                JOptionPane.PLAIN_MESSAGE);
                            }
                         else if (returnValue == JOptionPane.NO_OPTION)
                             t.clear();
                         

                    }
                });
                Aboutitem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {
                        JFrame frame = new JFrame("Main Window");
                        JOptionPane.showMessageDialog(frame,
                        "This note belongs to the Engineer Abdelrahman Magdy \n and if you want to talk to him call 01091516647",
                        "About the Engineer",
                        JOptionPane.PLAIN_MESSAGE);
                     
                    }
                });
                openitem.setOnAction(new EventHandler<ActionEvent>() {
            
                    @Override
                    public void handle(ActionEvent event) {

                      FileChooser j = new FileChooser();
                      File f = j.showOpenDialog(primaryStage);
                      if(f!=null)
                      {
                        try
                        {
                            String fileName = f.getAbsolutePath();
                            File file = new File(fileName);
                            FileReader fr = new FileReader(file);
                            BufferedReader br = new BufferedReader(fr);
                            String line;
                            while((line = br.readLine()) != null){
                                t.appendText(line);
                             }
                        }
                        catch(Exception e)
                        {
                              System.out.println(e.getMessage());
                        }
                         
                      }
                    }
                });
                Scene scene = new Scene (pane, 300, 400);
                primaryStage.setScene(scene);
                primaryStage.initStyle(StageStyle.DECORATED);
                primaryStage.setTitle("Notepad");
                primaryStage.show();

                // MenuBar bar = new MenuBar ();
                // Menu file = new Menu ("File");
                // MenuItem newItem1 = new MenuItem ("new");
                // newItem1.setAccelerator(KeyCombination.keyCombination("Ctrl+n"));
                // CheckMenuItem newItem2 = new CheckMenuItem("Check");
                // MenuItem openitem = new MenuItem ("open") ;
                // openitem.setGraphic(new ImageView(new Image(getClass()
                // .getResourceAsStream ("Abdo111.jpg")))) ;
                // file.getItems().addAll(newItem1,newItem2,openitem);
                // bar.getMenus().addAll(file) ;
                // BorderPane pane = new BorderPane () ;
                // pane. setTop (bar);
                // Scene scene = new Scene (pane, 300, 400);
                // primaryStage.setScene(scene);
                // primaryStage.initStyle(StageStyle.TRANSPARENT);
                // primaryStage.show();



// //دي ذي التيكست انبوت الي في الويب والتيكست دي ذي البلاس هولدر
//             TextField lastName = new TextField(); 
//             lastName.setPromptText("Enter vour lastname");






// هنا انا عملت ثلاثه اتشك بوكس واديت كل واحده قيمتها            
//             CheckBox ch1 = new CheckBox();
//             CheckBox ch2 = new CheckBox();
//             CheckBox ch3 = new CheckBox();
//             ch1.setIndeterminate(false);
//             ch1.setSelected(false);
//             ch1.setIndeterminate(false);
//             ch2.setSelected(true);
//             ch3.setIndeterminate(true);
//             ch3.setSelected(false);
//             FlowPane root = new FlowPane();
//             root.getChildren().addAll(ch1,ch2,ch3);
           // Scene scene = new Scene (lastName, 390, 400);



// هنا انا عرفت بوتن        
        // Button b1 = new Button("Normal");
// هنا انا عرفت بوتن       
        // Button b2 = new Button("Default");
//  هنا انا عرفت بوتن واديت لكل واحد نوع    
        // Button b3 = new Button("Cancel");
//ده خليته الديفولت       
        // b2.setDefaultButton(true);
//ده خليته الكانسل 
        // b3.setCancelButton(true);
//عملت حاجه اسمها فلو ذي انها يتعروضا ورا بعض بالترتيب ورتبتهم مين ورا مين 
        // FlowPane root = new FlowPane();
        // root.getChildren().addAll(b1,b2,b3);
//عملت السيم وحددت له المساحه
        // Scene scene = new Scene (root, 390, 400);
//اديته عنوان للشكل كله 
        // primaryStage.setTitle("Button Example");





//هنا بحط السيم في الاستيج علشان اعرض 
//primaryStage.setScene(scene);
// هنا كدا عرضت 
     //   primaryStage.show();
        }
      public static void main(String[] args)
      {
        Application.launch(args);
      }
}

// هنا انا عرفت حاجه من نوع تايتل باند واديتها اسم وبعد كدا حطيت جواها البوتن ومعلومه 
//لو كان عايز احط اكتر من عنصر انا لازم احطهم الاول في جروب بعد كدا اكتب اسم الجروب مكان البوتن
// TitledPane pane = new TitledPane("Sample Title", new Button("click me"));
//هنا انا عملت سيم فاضي واديته مساحته
// Scene scene = new Scene (new Group(), 300, 400);
//هنا بضيف جوه الجروب ده
// Group root = (Group)scene.getRoot();
//بعد كدا بقوله الجروب الكبير خلي الابان جواه 
// root.getChildren().add(pane);


//ده انا باخد بس صوره من الملف عندي وبخزنها في متغير
// Image img = new Image (getClass().getResourceAsStream("Abdo111.jpg"));
//انا كدا بعمل صوره ذي كاني بعمل تاج امج في html
// ImageView view = new ImageView(img);
//هنا انا بعمل ليبل وبضفله الكلمه الي اسمها تيكست لابل
// Label lable = new Label ("Test Lable",view);
//هنا انا بحدد مكان اللايبل ده يظهر فين وكدا 
// Lable.setContentDisplay (ContentDisplay. TOP)
