package GUI.Demo01AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * �ı���
 */
public class Text01 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);

        MyActionListen02 myActionListen02 = new MyActionListen02();
        textField.addActionListener(myActionListen02);//���»س��ͻᴥ������������¼�

        textField.setEchoChar('*');//������������

        setVisible(true);
        pack();

    }
}
class MyActionListen02 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource();//����ת�ͣ�����һ����Դ����
        System.out.println(field.getText());//���һ���ı�

        field.setText("");//���»س�֮�󣬾����
    }
}