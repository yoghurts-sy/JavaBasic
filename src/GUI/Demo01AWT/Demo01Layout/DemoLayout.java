package GUI.Demo01AWT.Demo01Layout;

import java.awt.*;

/**С��ϰ����������  ------------------------------
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
        frame.setLayout(new GridLayout(2, 1));//��񲼾�����һ��

        //4�����
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2, 1));

        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 2));

        //����
        p1.add(new Button("EAST_1"), BorderLayout.EAST);
        p1.add(new Button("WEST_1"), BorderLayout.WEST);

        p2.add(new Button("Up_center_1"));
        p2.add(new Button("Up_center_2"));

        p1.add(p2, BorderLayout.CENTER);

        //����
        p3.add(new Button("EAST_2"), BorderLayout.EAST);
        p3.add(new Button("WEST_2"), BorderLayout.WEST);

        for (int i = 1; i < 5; i++) {
            p4.add(new Button("Down_center_" + i));
        }

        p3.add(p4, BorderLayout.CENTER);

        //����������װ�����
        frame.add(p1, BorderLayout.NORTH);
        frame.add(p3, BorderLayout.SOUTH);



    }
}
