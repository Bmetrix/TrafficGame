package CrossRoad;
import javax.imageio.ImageIO;
import java.awt.event.MouseListener;
import java.awt.image.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.AttributedCharacterIterator;
import javax.swing.event.*;


public class Semafor extends JPanel implements MouseListener
{

    private int status;
    private Color offRed;
    private Color offYellow;
    private Color offGreen;

    public Semafor(int x,int y, int w, int h, Graphics g)
    {
        setBounds(x,y,w,h);
        addMouseListener(this);
        offRed = new Color(128, 0, 0);
        offYellow = new Color(192, 192, 0);
        offGreen = new Color(0, 96, 0);
        status = 0;

        paintComponent(g);
    }

    public void paintComponent(Graphics g)
    {
        g.setColor(new Color(43, 58, 66));
        g.fillRoundRect(0,0,40,120,6,6);
        g.setColor(Color.WHITE);
        g.drawOval(4,5,30,30);
        g.drawOval(4,45,30,30);
        g.drawOval(4,85,30,30);
        drawBackground(g);
        drawIlluminatedLights(g);
    }
    public void drawBackground(Graphics g)
    {
        g.setColor(offRed);
        g.fillOval(5, 6, 29, 29);
        g.setColor(Color.BLACK);
        g.drawOval(5, 6, 29, 29);
        g.setColor(offYellow);
        g.fillOval(5, 46, 29, 29);
        g.setColor(Color.BLACK);
        g.drawOval(5, 46, 29, 29);
        g.setColor(offGreen);
        g.fillOval(5, 85, 29, 29);
        g.setColor(Color.BLACK);
        g.drawOval(5, 85, 29, 29);
    }
    private void drawIlluminatedLights(Graphics g) {
        if (status == 0) {
            g.setColor(Color.RED);
            g.fillOval(5, 6, 29, 29);
            g.setColor(Color.BLACK);
            g.drawOval(5, 6, 29, 29);
        }
        else if (status == 1)
        {
            g.setColor(offRed);
            g.fillOval(5, 6, 29, 29);
            g.setColor(Color.BLACK);
            g.drawOval(5, 6, 29,29);
            g.setColor(Color.YELLOW);
            g.fillOval(5, 45, 29, 29);
            g.setColor(Color.BLACK);
            g.drawOval(5, 45, 29, 29);
        }
        else if (status == 2)
        {
            g.setColor(offYellow);
            g.fillOval(5, 45, 29, 29);
            g.setColor(Color.BLACK);
            g.drawOval(5, 45, 29, 29);
            g.setColor(Color.GREEN);
            g.fillOval(5, 85, 29, 29);
            g.setColor(Color.BLACK);
            g.drawOval(5, 85, 29, 29);
        }
        else if (status == 3)
        {
            g.setColor(offGreen);
            g.fillOval(5, 85, 29, 29);
            g.setColor(Color.BLACK);
            g.drawOval(5, 85, 29, 29);
            g.setColor(Color.RED);
            g.fillOval(5, 6, 29, 29);
            g.setColor(Color.BLACK);
            g.drawOval(5, 6,29, 29);
        }
    }
    public void mouseClicked(MouseEvent event) {
        if (status == 0) {
            status = 1;
        }
        else if (status == 1)
        {
            status = 2;
        }
        else if (status == 2)
        {
            status = 3;
        }
        else if (status == 3)
        {
            status = 1;
        }
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
