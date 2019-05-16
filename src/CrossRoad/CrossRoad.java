package CrossRoad;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 * Created by zak on 04.04.2019.
 */
public abstract class CrossRoad extends JPanel {

    private Image  image;
    Semafor s1, s2, s3, s4;

    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image,0,0,  getWidth(), getHeight(), this);

        s2 = new Semafor(30, 30, 30, 30, g);
        s3 = new Semafor(400, 40, 40, 40, g);
        s4 = new Semafor(50, 50, 50, 50, g);



    }

    public CrossRoad()
    {
        this(new ImageIcon("D:\\TrafficGame\\src\\CrossRoad\\Pictures\\DefaultCrossRoad.png").getImage());

    }

    public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }

    public CrossRoad(Image i)
    {
        image = i.getScaledInstance(400, 400, Image.SCALE_DEFAULT);
    }

    public abstract void carGenerator();

}
