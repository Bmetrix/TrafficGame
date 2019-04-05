import CrossRoad.CrossRoad;
import CrossRoad.DefaultCrossRoad;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame
{

  //  CrossRoad crossRoad;
    JFrame gameWindow;

    private JButton defaultCross;

    public Window()
    {
        super("Let's play!");
        setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.LIGHT_GRAY);


        defaultCross = new JButton("Default crossRoad map");
            defaultCross.addActionListener(new Posluchac());
        add(defaultCross);
    }

    class Posluchac implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == defaultCross)
            {
                setVisible(false);
                gameWindow = new JFrame();
                CrossRoad crossRoad = new DefaultCrossRoad();
                crossRoad.carGenerator();
                gameWindow.add(crossRoad);
                gameWindow.setSize(300,300);
                gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameWindow.setVisible(true);

            }else
            {
                JOptionPane.showMessageDialog(null, "Chyba", "Chyba", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
