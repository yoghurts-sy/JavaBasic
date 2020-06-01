package MultiThread.Demo04WaitAndNotify.DemoStack;

import java.util.Stack;

public class stackMain02 {
    public static void main(String[] args) {
        Object obj = new Object();
        Stack<Character> stack = new Stack<>();
        new Thread() { //Consumer
            @Override
            public void run() {
                for (int i = 1; i <= 200; i++) {
                    synchronized (obj) {
                        if (stack.size() == 0) {
                            try {
                                obj.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        Character c = stack.pop();
                        System.out.println("             NO." + i + " Pop  " + c);
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread() {  //Producer
            @Override
            public void run() {
                for (int i = 1; i <= 200; i++) {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        char c = (char) ((int)(Math.random() * 26) + 'A');
                        stack.push(c);
                        System.out.println("NO." + i + " Push " + c);
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
