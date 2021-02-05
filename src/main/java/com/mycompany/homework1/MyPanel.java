
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class MyPanel extends JPanel
{
 
int startX, flag, startY, endX, endY;

    BufferedImage grid;
    Graphics2D gc;
    int rgb[];
    private int max;

    MyPanel (int [] r){
        rgb = r;
        //max = num;
    }

    public void paintComponent(Graphics g)
   { 
         super.paintComponent(g);  
         Graphics2D g2 = (Graphics2D)g;
         if(grid == null){
            int w = this.getWidth();
            int h = this.getHeight();
            grid = (BufferedImage)(this.createImage(w,h));
            gc = grid.createGraphics();
            
         }
         g2.drawImage(grid, null, 0, 0);
         
   }

    public void drawHistogram()
    {
        //mapValues();
        

        for(int i = 20; i<276; i++){
            gc.drawLine(i, 585, i, 585-(int)rgb[i-20]);
        }
        repaint();

    }

    // public void mapValues(){
    //     double offset = 580.0/max;
    //     System.out.println(max + " offset " + offset);
    //     for (int i = 0; i < rgb.length; i++){
    //         rgb[i] = (int)(offset * rgb[i]);
    //     }
    // }
   
}
