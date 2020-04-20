package GUI.Layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** Panel����
 * ���Կ�����һ���ռ䣬���ǲ��ܶ�������
 */
public class GUIPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //���ֵĸ���
        Panel panel = new Panel();
        //���ò���
        frame.setLayout(null);//������Ĭ���ö�
        //����
        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(14, 27, 120));

        //panel�������꣬�����frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(120, 17, 144));

        //frame.add(panel)���Component
        frame.add(panel);
        frame.setVisible(true);

        //�����¼����������ڹر��¼���
        //ʹ��������ģʽ������дĳһ������
        frame.addWindowListener(new WindowAdapter(){

            @Override//���ڹر�ʱ��Ҫ��������
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }) ;{

        }

    }
}
