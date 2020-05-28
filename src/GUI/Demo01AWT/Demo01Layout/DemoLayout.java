package GUI.Demo01AWT.Demo01Layout;

import java.awt.*;

/**小练习，构建布局  ------------------------------
 *               |      |    btn           |    |
 *               -  btn -------------------- btn-
 *               |      |     btn          |    |
 *               -------------------------------
 *               |      | btn   |    btn    |    |
 *               - btn  -------------------- btn -
 *               |      | btn   |    btn    |    |
 *               --------------------------------
 *
 */
public class DemoLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setSize(400, 300);
        frame.setLocation(300, 400);
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2, 1));//表格布局两行一列

        //4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2, 1));

        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 2));

        //上面
        p1.add(new Button("EAST_1"), BorderLayout.EAST);
        p1.add(new Button("WEST_1"), BorderLayout.WEST);

        p2.add(new Button("Up_center_1"));
        p2.add(new Button("Up_center_2"));

        p1.add(p2, BorderLayout.CENTER);

        //下面
        p3.add(new Button("EAST_2"), BorderLayout.EAST);
        p3.add(new Button("WEST_2"), BorderLayout.WEST);

        for (int i = 1; i < 5; i++) {
            p4.add(new Button("Down_center_" + i));
        }

        p3.add(p4, BorderLayout.CENTER);

        //把两个布局装入面板
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p3, BorderLayout.SOUTH);



    }
}
