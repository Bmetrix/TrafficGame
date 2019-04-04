package CrossRoad;

import javax.swing.*;
import java.awt.*;

/**
 * Created by zak on 04.04.2019.
 */
public abstract class CrossRoad {

    private Image i;

    public CrossRoad()
    {

        i = new ImageIcon("D:\\TrafficGame\\src\\CrossRoad\\Pictures\\DefaultCrossRoad.png").getImage();
    }

    public CrossRoad(Image i)
    {

        this.i = i;
    }
}
