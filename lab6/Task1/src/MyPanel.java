import javax.swing.*;
import java.awt.*;
import java.util.Date;

class MyPanel extends JPanel implements Runnable{
    public MyPanel(){
        this.setBackground(Color.cyan);
        new Thread(this).start();
    }
    @Override
    public  void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(new Date().toString(),100,100);
    }
    @Override
    public void run(){
        while(true){
            try{
                this.repaint();
                Thread.sleep(
                        1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
