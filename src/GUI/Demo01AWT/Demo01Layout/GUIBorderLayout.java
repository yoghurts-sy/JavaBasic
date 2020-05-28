package GUI.Demo01AWT.Demo01Layout;

import java.awt.*;

/**
 * 东西南北中布局
 */
public class GUIBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button east = new Button("EAST");
        Button west = new Button("WEST");
        Button south = new Button("SOUTH");
        Button north = new Button("NORTH");
        Button center = new Button("CENTER");

        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
