package GUI.Layout;

import java.awt.*;

public class GUIFrame {

    public static void main(String[] args) {
        //��һ������
        Frame frame = new Frame("�ҵĵ�һ��Javaͼ�δ���");
        //��Ҫ��ƿɼ���
        frame.setVisible(true);
        //���ô��ڴ�С
        frame.setSize(400, 400);
        //���ñ�����ɫ
        Color color = new Color(255,192,203);
        frame.setBackground(color);
        //�����ĳ�ʼλ��
        frame.setLocation(200,200);//(0,0)���Ͻ�
        //���ô�С�̶�
        frame.setResizable(false);




    }

}
