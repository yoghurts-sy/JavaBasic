package GUI.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo01Dialog extends JFrame {

    public Demo01Dialog() {
        this.setVisible(true);
        this.setSize(700,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();/*容器*/
        container.setLayout(null);/*绝对布局*/

        JButton button = new JButton("请点击");
        button.setBounds(30, 30,200,50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Demo01DialogMyDialog();
            }
        });
        container.add(button);
    }

    public static void main(String[] args) {
        new Demo01Dialog();
    }
}
class Demo01DialogMyDialog extends JDialog {
    public Demo01DialogMyDialog() {
        this.setVisible(true);
        this.setBounds(100, 100,500,500);

        Container container = this.getContentPane();
        container.setLayout(null);


        container.add(new Label("HELLO"));
    }
}