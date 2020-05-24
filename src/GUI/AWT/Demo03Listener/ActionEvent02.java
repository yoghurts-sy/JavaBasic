package GUI.AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 两个按钮同用一个监听事件
 * 可以多个按钮只写一个监听器
 */
public class ActionEvent02 {
    public static void main(String[] args) {
        Frame frame = new Frame("开始-停止");

        Button button1 = new Button("start");
        Button button2 = new Button("close");

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * e.getActionCommand()获得按钮的信息
         */
        System.out.println("按钮被点击" + e.getActionCommand());
    }
}
