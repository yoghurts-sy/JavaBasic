package GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Demo02ImageIcon extends JFrame {
    public Demo02ImageIcon() {
        JLabel label = new JLabel("ImageIcon");
        //URL url = Demo02ImageIcon.class.getResource();

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\GUI\\Swing\\yoghurt.jpg");
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = getContentPane();
        container.add(label);

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100,100,200,200);
    }

    public static void main(String[] args) {
        new Demo02ImageIcon();
    }
}
