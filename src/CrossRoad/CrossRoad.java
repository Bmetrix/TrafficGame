package CrossRoad;
import Car.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Created by zak on 04.04.2019.
 */
public abstract class CrossRoad extends JPanel /*implements ActionListener*/{

    private Image  image;
    //Semafor s1, s2, s3, s4;
    private Car c = new Car(2,270,1);
    private Car c2 = new Car(531,210,3);
    private Semafor s2 = new Semafor(/*30, 30, 30, 30, g*/);
    private Semafor s3 = new Semafor(/*400, 40, 40, 40, g*/);
    private Semafor s4 = new Semafor(/*50, 50, 50, 50, g*/);
    private Semafor s1 = new Semafor(/*50, 50, 50, 50, g*/);
    private Timer tm = new Timer(5, this::actionPerformed);

    int i = 0;
    //public JButton b1,b2,b3,b4;


    /*private void mouseClicked(ActionEvent actionEvent) {
        s1.clicked();
        s2.clicked();
        s3.clicked();
        s4.clicked();

        i++;
        System.out.println(i);
        //repaint();
    }*/
    public void actionPerformed(ActionEvent e)
    {
        c.moving();
        c2.moving();
        repaint();
    }

    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,0,0,  getWidth(), getHeight(), this);
        c.paint(g);
        c2.paint(g);

        /*s2 = new Semafor(30, 30, 30, 30, g);
        s3 = new Semafor(400, 40, 40, 40, g);
        s4 = new Semafor(50, 50, 50, 50, g);*/
        /*s2.paint(g,350,75);
        s3.paint(g,350,330);
        s4.paint(g,140,75);
        s1.paint(g,140,330);*/


    }
    BufferedImage img;
    public CrossRoad()
    {
        this(new ImageIcon("D:\\TrafficGame\\src\\CrossRoad\\Pictures\\DefaultCrossRoad.png").getImage());
     //   tm2.start();
    }

    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }

    public CrossRoad(Image i)
    {
        setLayout(null);
        add(s1);
        add(s2);
        add(s3);
        add(s4);
        s1.setBounds(140,330,40,120);
        s2.setBounds(350,75,40,120);
        s3.setBounds(350,330,40,120);
        s4.setBounds(140,75,40,120);
        image = i.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        tm.start();
    }

    public abstract void carGenerator();


}
