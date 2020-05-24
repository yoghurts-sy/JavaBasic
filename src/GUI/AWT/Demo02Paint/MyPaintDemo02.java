package GUI.AWT.Demo02Paint;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * �������¼�+����
 */
public class MyPaintDemo02 {
    public static void main(String[] args) {
        new MyFrame02("��ͼ");
    }
}

class MyFrame02 extends Frame{
    ArrayList points;//���ϴ洢��

    public MyFrame02(String title){
        super(title);
        setBounds(200, 200, 400, 300);
        points = new ArrayList<>();
        setVisible(true);
        //�������������������
        this.addMouseListener(new MyMouseListener());
    }
    //��
    public void paint (Graphics g){
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point) iterator.next();
            g.setColor(Color.cyan);
            g.fillOval(point.x, point.y, 10 , 10);
        }
    }

    //���һ���㵽������
    public void addPoint(Point point){
        points.add(point);
    }

    //������ģʽ ����������д  �ڲ���
    private class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame02 frame02 = (MyFrame02) e.getSource();
            //���ǵ����ʱ��Ͳ���һ����
            frame02.addPoint(new Point(e.getX(), e.getY()));
            //ÿ�ε��֮��Ҫˢ��һ��
            frame02.repaint();
        }
    }

}
