package GUI.AWT.Demo03Listener;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * 未完成
 */
public class KeyListener {
    public static void main(String[] args) {
        new MyKeyListenFrame();
    }
}
class MyKeyListenFrame extends Frame{
    Graphics graphics;

    public MyKeyListenFrame(){
        setBounds(1,1,100, 100);
        setBackground(Color.CYAN);
        setVisible(true);

        this.addKeyListener(
                new KeyAdapter() {
                    @Override
                    public void keyPressed(KeyEvent e) {
                        int keyCode = e.getKeyCode();
                        if (keyCode == KeyEvent.VK_UP) {
                            System.out.println("你点击了上键");
                            //paint(graphics);
                        }
                    }
                }
        );
    }
    public void paint (Graphics g){
        g.setColor(Color.GREEN);
        Random random = new Random(0);
        g.fillRect(random.nextInt(50), random.nextInt(50),1,1);
        repaint();
    }
}
