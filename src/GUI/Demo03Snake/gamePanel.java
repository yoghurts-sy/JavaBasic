package GUI.Demo03Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gamePanel extends JPanel implements KeyListener, ActionListener {
    //�����ߵ����ݽṹ
    int length;
    int[] snakeX = new int[600];
    int[] snakeY = new int[500];
    String fx;
    boolean isStart = false;

    /*��ʱ��*/
    Timer timer = new Timer(100, this);

    public gamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();
    }

    public void init() {
        int length = 3;
        snakeX[0] = 100;snakeY[0] = 100;
        snakeX[1] = 75;snakeY[1] = 100;
        snakeX[2] = 50;snakeY[2] = 100;
        fx = "R";
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        gameData.header.paintIcon(this,g,25,11);//ͷ�����
        g.fillRect(25,75,850,600);

        if (fx.equals("R")){
            gameData.right.paintIcon(this, g, snakeX[0],snakeY[0]);
        } else if (fx.equals("L")){
            gameData.left.paintIcon(this, g, snakeX[0],snakeY[0]);
        } else if (fx.equals("U")){
            gameData.up.paintIcon(this, g, snakeX[0],snakeY[0]);
        } else if (fx.equals("D")){
            gameData.down.paintIcon(this, g, snakeX[0],snakeY[0]);
        }
        for (int i = 1 ; i < length; i++){
            gameData.body.paintIcon(this, g, snakeX[i],snakeY[i]);
        }
        if (!isStart) {
            g.setColor(Color.white);
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.drawString("���¿ո�ʼ��Ϸ��",300,300);
        }
    }



    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE) {
            isStart = !isStart;
            repaint();
        }
        if (keyCode==KeyEvent.VK_UP){
            fx = "U";
        } else if (keyCode==KeyEvent.VK_DOWN){
            fx = "D";
        } else if (keyCode==KeyEvent.VK_LEFT){
            fx = "L";
        } else if (keyCode==KeyEvent.VK_RIGHT){
            fx = "R";
        }
    }
    /*��ʱ��*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart) {
            for (int i = length - 1; i > 0 ; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
            if (fx.equals("R")) {
                snakeX[0] += 25;
                if (snakeX[0] > 850){ snakeX[0] = 25; }
            } else if (fx.equals("L")) {
                snakeX[0] -= 25;
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }
            } else if (fx.equals("U")) {
                snakeY[0] -= 25;
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }
            } else if (fx.equals("D")) {
                snakeY[0] += 25;
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }
            }
            repaint();
        }
        timer.start();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }


}
