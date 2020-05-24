package GUI.Swing;

import javax.swing.*;
import java.awt.*;

public class Demo03JScroll extends JFrame {
    public Demo03JScroll() {
        Container contentPane = getContentPane();

        JTextArea jTextArea = new JTextArea(20, 50);
        jTextArea.setText("hello");

        JScrollPane scrollPane = new JScrollPane(jTextArea);
        contentPane.add(scrollPane);

        setVisible(true);
        setBounds(100,100,300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo03JScroll();
    }
}
