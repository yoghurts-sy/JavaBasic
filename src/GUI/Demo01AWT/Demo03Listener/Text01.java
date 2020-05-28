package GUI.Demo01AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 文本框
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
        textField.addActionListener(myActionListen02);//按下回车就会触发这个输入框的事件

        textField.setEchoChar('*');//类似输入密码

        setVisible(true);
        pack();

    }
}
class MyActionListen02 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField) e.getSource();//向下转型，返回一个资源对象
        System.out.println(field.getText());//获得一个文本

        field.setText("");//按下回车之后，就清空
    }
}