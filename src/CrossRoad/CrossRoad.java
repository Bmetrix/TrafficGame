package CrossRoad;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zak on 04.04.2019.
 */
public abstract class CrossRoad extends JPanel {

    private Image i;

    public void paintComponent (Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(i,0,0,null);
    }

    public CrossRoad()
    {

        i = new ImageIcon("D:\\TrafficGame\\src\\CrossRoad\\Pictures\\DefaultCrossRoad.png").getImage();;

    }

    public CrossRoad(Image i)
    {

        this.i = i;
    }

    public abstract void carGenerator();

}
