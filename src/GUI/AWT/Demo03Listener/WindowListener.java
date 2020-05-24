package GUI.AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * ���ڼ�����
 */
public class WindowListener {
    public static void main(String[] args) {
        new MyWindowFrame("��ð�");
    }
}
class MyWindowFrame extends Frame{
     public MyWindowFrame (String title){
        super(title);
        setBackground(Color.CYAN);
        setBounds(100, 100, 200, 200);
        setVisible(true);

        this.addWindowListener(//�����ڲ���,ע��������
            new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.out.println("�����˹ر�");
                    System.exit(0);
                }

                @Override
                public void windowActivated(WindowEvent e) {
                    MyWindowFrame source = (MyWindowFrame) e.getSource();
                    source.setTitle("��ȥ���ˣ�");
                    System.out.println("windowActivated");
                }
            }
        ); //ע������
    }
}
