package GUI.Demo03Snake;

import javax.swing.*;

public class gameFrame {
    public static void loading() {
        JFrame frame = new JFrame();

        frame.setBounds(10,10,900,720);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new gamePanel());

        frame.setVisible(true);
    }
}
