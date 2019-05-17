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

    private JButton defaultCross, mainWindow;
    private JLabel score;


    public Window()
    {
        super("Let's play!");
        setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.LIGHT_GRAY);


        defaultCross = new JButton("Default crossRoad map");
            defaultCross.addActionListener(new Posluchac());
        add(defaultCross);

        gameWindow = new JFrame();
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setResizable(false);
        gameWindow.setLayout(new BoxLayout(gameWindow.getContentPane(), BoxLayout.Y_AXIS));

        JPanel gameBar = new JPanel();
            gameBar.setLayout(new FlowLayout(FlowLayout.LEFT));
            mainWindow = new JButton("menu");
                gameBar.add(mainWindow);
            score = new JLabel("Score");
            score.setHorizontalAlignment(5);
                gameBar.add(score);
        gameWindow.add(gameBar);
    }

    class Posluchac implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {

            if(e.getSource() == defaultCross)
            {

                setVisible(false);
                CrossRoad crossRoad = new DefaultCrossRoad();
                gameWindow.add(crossRoad);
                gameWindow.pack();
                gameWindow.setVisible(true);
            }else
            {
                JOptionPane.showMessageDialog(null, "Chyba", "Chyba", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
