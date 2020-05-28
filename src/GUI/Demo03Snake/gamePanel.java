package GUI.Demo03Snake;

import javax.swing.*;
import java.awt.*;

public class gamePanel extends JPanel {
    //定义蛇的数据结构
    int length;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        gameData.header.paintIcon(this,g,25,11);//头部广告
        g.fillRect(25,75,850,600);

    }
}
