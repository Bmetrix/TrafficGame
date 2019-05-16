import CrossRoad.CrossRoad;
import CrossRoad.DefaultCrossRoad;
import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;


public class Window extends JFrame
{

    int score;

    JFrame gameWindow;

    private JButton defaultCross, mainWindow;

    public Window()
    {
        super("Let's play!");
        setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.LIGHT_GRAY);


        defaultCross = new JButton("Default crossRoad map");
            defaultCross.addActionListener(new Posluchac());
        add(defaultCross);

        gameWindow = new JFrame();
        gameWindow.setLayout(new FlowLayout());
        gameWindow.setSize(500,500);

        JPanel statusBoard = new JPanel();
            statusBoard.setLayout(new FlowLayout());
            mainWindow = new JButton("return");
                mainWindow.addActionListener(new Posluchac());
            JLabel score = new JLabel("Score: ");
            statusBoard.add(mainWindow);
            statusBoard.add(score);

        gameWindow.add(statusBoard);
    }

    class Posluchac implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == defaultCross)
            {

                setVisible(false);
                CrossRoad crossRoad = new DefaultCrossRoad();
               // gameWindow.pack();
                gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gameWindow.add(crossRoad);
                //gameWindow.pack();
                gameWindow.setResizable(false);
                gameWindow.setVisible(true);

            }else if(e.getSource() == mainWindow)
            {
                setVisible(true);
                gameWindow.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Chyba", "Chyba", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
