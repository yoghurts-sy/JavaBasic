package GUI.Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** Panel布局
 * 可以看成是一个空间，但是不能独立存在
 */
public class GUIPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();
        //设置布局
        frame.setLayout(null);//不设置默认置顶
        //坐标
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(14, 27, 120));

        //panel设置坐标，相对于frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(120, 17, 144));

        //frame.add(panel)添加Component
        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听窗口关闭事件，
        //使用适配器模式，即重写某一个方法
        frame.addWindowListener(new WindowAdapter(){

            @Override//窗口关闭时需要做的事情
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }) ;{

        }

    }
}
