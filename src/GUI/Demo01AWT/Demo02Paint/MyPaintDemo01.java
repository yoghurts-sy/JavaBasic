package GUI.Demo01AWT.Demo02Paint;

import java.awt.*;

public class MyPaintDemo01 {
    public static void main(String[] args) {
        new MyPaint01().loadFrame();
    }
}

class MyPaint01 extends Frame {
    public void loadFrame(){
        setBounds(200, 200, 600, 500);
        setVisible(true);
    }
    //»­±Ê
    public void  paint(Graphics graphics){
        graphics.setColor(Color.GREEN);
        graphics.drawOval(100, 100, 100, 100);
        graphics.fillRect(150, 200, 200, 200);

    }
}
