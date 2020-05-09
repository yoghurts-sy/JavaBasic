# JavaBasic

![](https://github.com/yoghurts-sy/JavaBasic/blob/master/u%3D4274393615%2C4090509011%26fm%3D26%26gp%3D0.jpg)

**一、Git和GitHub的使用**  

### (1) Github第一次上传步骤：  
步骤 | 说明
------------- | ------------------------------------
1.复制新仓库ssh | 没有的可以创建
2.在含src的目录下，右键git Bash | 类似cmd
3.git init | 将项目初始化，使git可以管理这个项目  
4.git add . | 将项目内所有文件添加到暂存区  
5.git commit -m '附带的信息' | 将文件推到commit区  
6.git remote add origin 仓库地址	| 关联git仓库(repository)  
7.git pull --rebase origin master | 将仓库和文件合并  
8.git push -u origin master | 将文件推到远程仓库  		  

### (2) git回溯某个历史版本  
步骤 | 说明
------------- | --------------------------------------------------
git log | 会显示从最远到最近的commit日志
git reset --hard~** | 如git reset --hard~100往上100个版本

### (3)git常用命令  
命令 | 说明
------------- | ---------------
git status | 当前仓库状态
clear | 清屏 

## 二、具体学习内容在代码中。

## 三、学习心泉

### （1）使用内部类来优化代码的，使代码简洁美丽

```java
package GUI.Listener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** 美丽的代码
 * 使用内部类的方式优化代码,以后都要使用内部类来编程
 * 一个类包含：
 *          属性
 *          方法
 *  		内部类
 */
public class DemoCalcUpgrate {
    public static void main(String[] args) {
        new MyCalculator().loadFrame();
    }
}

class MyCalculator extends Frame {
    //属性
    TextField num1, num2, num3;

    //方法
    public void loadFrame(){

        num1 = new TextField(10);
        num2 = new TextField(10);
        num3 = new TextField(10);
        Button button = new Button("=");
        Label label = new Label("+");

        button.addActionListener(new MyCalculatorListener());

        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        pack();
        setVisible(true);
    }

    private class MyCalculatorListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            num3.setText("" + (n1 + n2));
            num1.setText("");
            num2.setText("");
        }
    }


}
```

