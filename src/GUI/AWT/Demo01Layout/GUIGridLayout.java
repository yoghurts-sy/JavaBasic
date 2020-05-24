package GUI.AWT.Demo01Layout;

import java.awt.*;

/**
 * 表格布局
 */
public class GUIGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("GUIGridLayout");

        Button button1 = new Button("btn1");
        Button button2 = new Button("btn2");
        Button button3 = new Button("btn3");
        Button button4 = new Button("btn4");
        Button button5 = new Button("btn5");
        Button button6 = new Button("btn6");

        frame.setLayout(new GridLayout(3, 2));

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        frame.pack();//自动布局得好看一点
        frame.setVisible(true);


    }
}
