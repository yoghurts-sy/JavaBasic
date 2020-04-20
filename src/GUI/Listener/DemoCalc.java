package GUI.Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * �ӷ������С�ͼ�����
 */
public class DemoCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}

//���������
class Calculator extends Frame{
   public Calculator(){
       //�����ı���
       TextField textField1 = new TextField(10);//�ַ���
       TextField textField2 = new TextField(10);
       TextField textField3 = new TextField(10);

       //1����ť
       Button button = new Button("=");
       button.addActionListener(new MyCalculatorListener(textField1, textField2, textField3));

       //1����ǩ
       Label label = new Label("+");

       setLayout(new FlowLayout());

       add(textField1);
       add(label);
       add(textField2);
       add(button);
       add(textField3);

       pack();
       setVisible(true);
   }
}
class MyCalculatorListener implements ActionListener{
    private TextField t1, t2, t3;
    MyCalculatorListener(TextField t1, TextField t2, TextField t3){
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //���ռ����ͱ�����
        int n1 = Integer.parseInt(t1.getText());
        int n2= Integer.parseInt(t2.getText());

        //���
        t3.setText(""+ (n1 + n2));

        //���
        t1.setText("");
        t2.setText("");
    }
}

