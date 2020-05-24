package GUI.AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 窗口监听器
 */
public class WindowListener {
    public static void main(String[] args) {
        new MyWindowFrame("你好啊");
    }
}
class MyWindowFrame extends Frame{
     public MyWindowFrame (String title){
        super(title);
        setBackground(Color.CYAN);
        setBounds(100, 100, 200, 200);
        setVisible(true);

        this.addWindowListener(//匿名内部类,注意是括号
            new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("你点击了关闭");
                    System.exit(0);
                }

                @Override
                public void windowActivated(WindowEvent e) {
                    MyWindowFrame source = (MyWindowFrame) e.getSource();
                    source.setTitle("人去哪了？");
                    System.out.println("windowActivated");
                }
            }
        ); //注意这里
    }
}
