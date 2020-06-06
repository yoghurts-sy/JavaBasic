package GUI.Demo03Snake;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class gamePanel extends JPanel implements KeyListener, ActionListener {
    //�����ߵ����ݽṹ
    int length;
    int[] snakeX = new int[600];
    int[] snakeY = new int[500];
    String fx;
    boolean isStart = false;
    boolean isFail = false;
    int foodX;
    int foodY;
    Random random = new Random();
    int score;
    int level;
    int levelJudge = 100;
    int timerUp = 10;
    boolean UPP = false;

    long start = 0;
    long end;

    boolean flag = false;
    boolean bigfoodflag = false;

    /*��ʱ��*/
    Timer timer = new Timer(100, this);

    public gamePanel() {
        init();
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();
    }

    public void init() {
        length = 3;//С�߻������������������
        snakeX[0] = 100;snakeY[0] = 100;
        snakeX[1] = 75;snakeY[1] = 100;
        snakeX[2] = 50;snakeY[2] = 100;
        fx = "R";
        level = 1;

        foodX = 25 + 25 * random.nextInt(34);
        foodY = 75 + 25 * random.nextInt(24);
        score = 0;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);//����
        this.setBackground(Color.white);
        gameData.header.paintIcon(this,g,25,11);//ͷ�����
        g.fillRect(25,75,850,600);

        g.setColor(Color.WHITE);
        g.setFont(new Font("΢���ź�", Font.BOLD, 18));
        g.drawString("���ȣ�" + length, 750, 35);
        g.drawString("������" + score, 650, 35);
        g.drawString("Level��" + level, 550, 35);

        if (score % 50 == 0 && score != 0 && bigfoodflag == false) {
            gameData.bigfood.paintIcon(this, g, foodX, foodY);
        } else {
            gameData.food.paintIcon(this, g, foodX, foodY);
        }


        for (int i = 1 ; i < length; i++){
            gameData.body.paintIcon(this, g, snakeX[i],snakeY[i]);
        }

        if (fx.equals("R")){
            gameData.right.paintIcon(this, g, snakeX[0],snakeY[0]);
        } else if (fx.equals("L")){
            gameData.left.paintIcon(this, g, snakeX[0],snakeY[0]);
        } else if (fx.equals("U")){
            gameData.up.paintIcon(this, g, snakeX[0],snakeY[0]);
        } else if (fx.equals("D")){
            gameData.down.paintIcon(this, g, snakeX[0],snakeY[0]);
        }



        if (!isStart) {
            g.setColor(Color.white);
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.drawString("���¿ո�ʼ��Ϸ��",300,300);
        }

        if (isFail) {
            g.setColor(Color.RED);
            g.setFont(new Font("΢���ź�", Font.BOLD, 40));
            g.drawString("��Ϸʧ�ܣ����¿ո����¿�ʼ",300,300);
        }

        if (level == 10) {
            UPP = true;
            g.setColor(Color.cyan);
            g.setFont(new Font("΢���ź�",Font.BOLD,40));
            g.drawString("��ϲ�㣬���سɹ�������̰������ţ�",150,300);
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE) {
            if (isFail) {
                isFail = false;
                init();
            } else {
                isStart = !isStart;
            }
            repaint();
        }
        if (keyCode==KeyEvent.VK_UP && !fx.equals("D")){
            fx = "U";
        } else if (keyCode==KeyEvent.VK_DOWN && !fx.equals("U")){
            fx = "D";
        } else if (keyCode==KeyEvent.VK_LEFT && !fx.equals("R")){
            fx = "L";
        } else if (keyCode==KeyEvent.VK_RIGHT && !fx.equals("L")){
            fx = "R";
        }
    }
    /*��ʱ��*/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (UPP == false) {
            if (isStart && !isFail) {
                if (snakeX[0] == foodX && snakeY[0] == foodY) {
                    if (flag == true) {
                        score += 30;
                    } else {
                        score += 10;
                    }
                    length++;
                    foodX = 25 + 25 * random.nextInt(34);
                    foodY = 75 + 25 * random.nextInt(24);
                    bigfoodflag = false;
                    flag = false;
                    start = 0;
                }

                if (score % 50 == 0 && start == 0 && score != 0 && flag == false) {
                    start = System.currentTimeMillis();
                    flag = true;
                }
                if (start != 0) {
                    end = System.currentTimeMillis();
                    if ((end - start) > 5000 && start != 0) {
                        foodX = 25 + 25 * random.nextInt(34);
                        foodY = 75 + 25 * random.nextInt(24);
                        bigfoodflag = true;
                        start = 0;
                        end = 0;
                    }
                }

                if (score >= levelJudge) {//����
                    timer.setDelay(timer.getDelay() - timerUp);
                    level++;
                    levelJudge += 100;
                }



                for (int i = length - 1; i > 0 ; i--) {
                    snakeX[i] = snakeX[i - 1];
                    snakeY[i] = snakeY[i - 1];
                }
                if (fx.equals("R")) {
                    snakeX[0] += 25;
                    if (snakeX[0] > 850) {
                        snakeX[0] = 25;
                    }
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
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
                    isFail=true;
                }
            }
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
