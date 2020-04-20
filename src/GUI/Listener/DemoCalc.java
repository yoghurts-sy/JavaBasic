package GUI.Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 加法运算的小型计算器
 */
public class DemoCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}

//计算器框架
class Calculator extends Frame{
   public Calculator(){
       //三个文本框
       TextField textField1 = new TextField(10);//字符数
       TextField textField2 = new TextField(10);
       TextField textField3 = new TextField(10);

       //1个按钮
       Button button = new Button("=");
       button.addActionListener(new MyCalculatorListener(textField1, textField2, textField3));

       //1个标签
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
        //接收加数和被加数
        int n1 = Integer.parseInt(t1.getText());
        int n2= Integer.parseInt(t2.getText());

        //相加
        t3.setText(""+ (n1 + n2));

        //清除
        t1.setText("");
        t2.setText("");
    }
}

