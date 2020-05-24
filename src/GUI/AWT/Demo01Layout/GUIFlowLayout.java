package GUI.AWT.Demo01Layout;

import java.awt.*;

/**
 * 流式布局
 *      东西南北中
 *
 *      表格布局
 */
public class GUIFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //组件 按钮
        Button button1 = new Button("确认");
        Button button2 = new Button("好");
        Button button3 = new Button("取消");

        //设置为流失布局,靠左
        //frame.setLayout(new FlowLayout());居中
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        frame.setSize(200, 200);

        //把按钮添加上
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);


    }
}
