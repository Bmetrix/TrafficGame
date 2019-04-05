import javax.swing.*;

public class Main {

    static Window window;

    public static void main(String[] args) {

        window = new Window();
        window.setSize(500,500);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
