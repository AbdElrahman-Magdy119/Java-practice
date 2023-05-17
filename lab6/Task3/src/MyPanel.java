import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    int x,y,deltaX,deltaY;

    public MyPanel(){
        x=0;
        y=100;
        deltaX=x+5;
        deltaY=y+5;
        this.setBackground(Color.black);
        new Thread(()->{
            while (true){
                try{
                    this.repaint();
                    Thread.sleep(1000);
                    updatePosition();
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }).start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.drawOval(x,y,10,10);
        g.setColor(Color.red);
        g.fillOval(x,y,10,10);

    }

    private  void updatePosition(){
        x+=deltaX;
        y+=deltaY;
        if(y>=this.getHeight()) deltaY=-deltaY;
        if(x>=this.getWidth()) deltaX=-deltaX;
        if(y<=0) deltaY=-deltaY;
        if(x<=0) deltaX=-deltaX;
    }
}
