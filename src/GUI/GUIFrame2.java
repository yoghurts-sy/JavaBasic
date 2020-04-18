package GUI;

import java.awt.*;

/**
 * 展示多个窗口
 */
public class GUIFrame2 {
    public static void main(String[] args) {
        Color color = new Color(255, 192, 203);
        new MyFrame(100, 100, 200, 200, color);
        new MyFrame(300, 100, 200, 200, Color.YELLOW);
        new MyFrame(100, 300, 200, 200, color);
        new MyFrame(300, 300, 200, 200, Color.CYAN);


    }
}
class MyFrame extends Frame{
    static int id = 0;//计数器

    public MyFrame(int x, int y, int w, int h, Color color){
        super("Myframe" + (++id));
        setVisible(true);
        setBounds(x, y, w, h);
        setBackground(color);
    }

}