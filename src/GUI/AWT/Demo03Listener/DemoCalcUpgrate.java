package GUI.AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** 美丽的代码
 * 使用内部类的方式优化代码,以后都要使用内部类来编程
 * 一个类包含：
 *          属性
 *          方法
 */
public class DemoCalcUpgrate {
    public static void main(String[] args) {
        new MyCalculator().loadFrame();
    }
}

class MyCalculator extends Frame {
    //属性
    TextField num1, num2, num3;

    //方法
    public void loadFrame(){

        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(10);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener());

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
    }

    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1 + n2));
            num1.setText("");
            num2.setText("");
        }
    }


}

