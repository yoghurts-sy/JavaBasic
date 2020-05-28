package GUI.Demo02Swing;

import javax.swing.*;
import java.awt.*;

/**
 * µ¥Ñ¡°´Å¥
 */
public class Demo04RadioButton extends JFrame {
    public Demo04RadioButton(){
        Container container = getContentPane();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\GUI\\Swing\\yoghurt.jpg");

        JRadioButton radioButton01 = new JRadioButton("radioButton01");
        JRadioButton radioButton02 = new JRadioButton("radioButton02");
        JRadioButton radioButton03 = new JRadioButton("radioButton03");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton01);
        group.add(radioButton02);
        group.add(radioButton03);

        container.add(radioButton01, BorderLayout.NORTH);
        container.add(radioButton02, BorderLayout.CENTER);
        container.add(radioButton03, BorderLayout.SOUTH);

        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo04RadioButton();
    }
}
