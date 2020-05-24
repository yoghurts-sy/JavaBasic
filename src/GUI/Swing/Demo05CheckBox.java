package GUI.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * ¸´Ñ¡°´Å¥
 */
public class Demo05CheckBox extends JFrame {
    public Demo05CheckBox(){
        Container container = getContentPane();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\GUI\\Swing\\yoghurt.jpg");

        JCheckBox checkBox01 = new JCheckBox("checkBox01");
        JCheckBox checkBox02 = new JCheckBox("checkBox02");

        container.add(checkBox01, BorderLayout.NORTH);
        container.add(checkBox02, BorderLayout.CENTER);

        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo05CheckBox();
    }
}
