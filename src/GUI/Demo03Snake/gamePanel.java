package GUI.Demo03Snake;

import javax.swing.*;
import java.awt.*;

public class gamePanel extends JPanel {
    //�����ߵ����ݽṹ
    int length;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        gameData.header.paintIcon(this,g,25,11);//ͷ�����
        g.fillRect(25,75,850,600);

    }
}
