package GUI.Layout;

import java.awt.*;

public class GUIFrame {

    public static void main(String[] args) {
        //建一个窗口
        Frame frame = new Frame("我的第一个Java图形窗口");
        //需要设计可见性
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(400, 400);
        //设置背景颜色
        Color color = new Color(255,192,203);
        frame.setBackground(color);
        //弹出的初始位置
        frame.setLocation(200,200);//(0,0)左上角
        //设置大小固定
        frame.setResizable(false);




    }

}
