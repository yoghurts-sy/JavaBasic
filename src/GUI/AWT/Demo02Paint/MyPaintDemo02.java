package GUI.AWT.Demo02Paint;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 鼠标监听事件+画笔
 */
public class MyPaintDemo02 {
    public static void main(String[] args) {
        new MyFrame02("画图");
    }
}

class MyFrame02 extends Frame{
    ArrayList points;//集合存储点

    public MyFrame02(String title){
        super(title);
        setBounds(200, 200, 400, 300);
        points = new ArrayList<>();
        setVisible(true);
        //鼠标监听器正对这个窗口
        this.addMouseListener(new MyMouseListener());
    }
    //画
    public void paint (Graphics g){
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.cyan);
            g.fillOval(point.x, point.y, 10 , 10);
        }
    }

    //添加一个点到界面上
    public void addPoint(Point point){
        points.add(point);
    }

    //适配器模式 鼠标监听器重写  内部类
    private class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame02 frame02 = (MyFrame02) e.getSource();
            //我们点击的时候就产生一个点
            frame02.addPoint(new Point(e.getX(), e.getY()));
            //每次点击之后都要刷新一次
            frame02.repaint();
        }
    }

}
