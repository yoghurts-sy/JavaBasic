package GUI.Listener;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ÊÂ¼þ¼àÌý
 */
public class ActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Button button = new Button();

        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);

        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);

        windowsClose(frame);

    }

    public static void windowsClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}


class MyActionListener implements ActionListener{
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("aaabbbccc");
    }
}