import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel //implements Runnable
{
    int x;
    public MyPanel(){
        this.setBackground(Color.cyan);
        new Thread(()->{
            while(true){
                try{
                    this.repaint();
                    Thread.sleep(1000);
                    x+=15;
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }).start();
        x=50;
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(x>=this.getWidth()) x=0;
        g.drawString("Move",x,100);
    }
//    @Override
//    public void run(){
//        while(true){
//            try{
//                this.repaint();
//                Thread.sleep(1000);
//                x+=5;
//            }catch(InterruptedException e){
//                System.out.println(e);
//            }
//        }
//    }
}
