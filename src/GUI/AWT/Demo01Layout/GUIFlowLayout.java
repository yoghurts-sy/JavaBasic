package GUI.AWT.Demo01Layout;

import java.awt.*;

/**
 * ��ʽ����
 *      �����ϱ���
 *
 *      ��񲼾�
 */
public class GUIFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //��� ��ť
        Button button1 = new Button("ȷ��");
        Button button2 = new Button("��");
        Button button3 = new Button("ȡ��");

        //����Ϊ��ʧ����,����
        //frame.setLayout(new FlowLayout());����
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(200, 200);

        //�Ѱ�ť�����
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);


    }
}
