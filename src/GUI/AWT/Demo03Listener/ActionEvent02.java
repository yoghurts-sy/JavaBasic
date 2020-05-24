package GUI.AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ������ťͬ��һ�������¼�
 * ���Զ����ťֻдһ��������
 */
public class ActionEvent02 {
    public static void main(String[] args) {
        Frame frame = new Frame("��ʼ-ֹͣ");

        Button button1 = new Button("start");
        Button button2 = new Button("close");

        MyMonitor myMonitor = new MyMonitor();

        button1.addActionListener(myMonitor);
        button2.addActionListener(myMonitor);

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
class MyMonitor implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * e.getActionCommand()��ð�ť����Ϣ
         */
        System.out.println("��ť�����" + e.getActionCommand());
    }
}
