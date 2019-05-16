package Car;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.io.*;
import java.util.Random;
import java.awt.event.*;

import static sun.misc.PostVMInitHook.run;


public class Car extends JPanel{
    String[] images = new String[]{"Car1.png", "Car2.png", "Car3.png"};
    int i = (int) (Math.random() * (images.length - 1));
    int x = 2,y = 270,s = 1;
    BufferedImage img;
    public Car(int xa, int ya, int sa) {
        this.x=xa;
        this.y=ya;
        this.s=sa;
        setBounds(x, y, 140, 50);
        File f = new File("F:\\PCV\\PCV\\src\\Pictures\\Car1.png");
        try
        {
            img = ImageIO.read(f);

        }catch(IOException e)
        {
            System.out.println("Chyba pri načítání obrázku!!!");
        }
        setVisible(true);
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getS()
    {
        return s;
    }

    public void paintComponent(Graphics g)
    {
        paint(g);
    }
    public void paint(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, x,y,140,50, this);
        //remove(g);
    }
    /*public void remove(Graphics g)
    {
        if(x == 400)
        {
            super.paintComponent(g);
            //g.drawImage(img, x,y,null);
            g.clearRect(x,y,140,50);
            repaint();
        }
    }*/
    public void moving()
    {
        if(s == 1)
        {
            x += 2;
        }
        else
        {
            if(s == 2)
            {
                y -= 2;
            }
            else
            {
                if(s == 3)
                {
                    x-=2;
                }
                else
                {
                    y+=2;
                }
            }
        }
    }

}
