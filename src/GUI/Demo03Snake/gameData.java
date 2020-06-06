package GUI.Demo03Snake;

import javax.swing.*;
import java.net.URL;

public class gameData {
    public static URL headerURL = gameData.class.getResource("static/header.png");
    public static URL upURL = gameData.class.getResource("static/up.png");
    public static URL downURL = gameData.class.getResource("static/down.png");
    public static URL leftURL = gameData.class.getResource("static/left.png");
    public static URL rightURL = gameData.class.getResource("static/right.png");
    public static URL bodyURL = gameData.class.getResource("static/body.png");
    public static URL foodURL = gameData.class.getResource("static/food.png");
    public static URL bigfoodURL = gameData.class.getResource("static/bigfood.png");

    public static ImageIcon header = new ImageIcon(headerURL);
    public static ImageIcon up = new ImageIcon(upURL);
    public static ImageIcon down = new ImageIcon(downURL);
    public static ImageIcon left = new ImageIcon(leftURL);
    public static ImageIcon right = new ImageIcon(rightURL);
    public static ImageIcon body = new ImageIcon(bodyURL);
    public static ImageIcon food = new ImageIcon(foodURL);
    public static ImageIcon bigfood = new ImageIcon(bigfoodURL);



}
