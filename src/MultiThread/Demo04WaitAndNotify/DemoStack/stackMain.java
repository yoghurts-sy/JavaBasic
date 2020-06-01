package MultiThread.Demo04WaitAndNotify.DemoStack;

import java.util.Stack;

public class stackMain {
    public static void main(String[] args) {
        SyncStack stack = new SyncStack();
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 class SyncStack {
    private Stack<Character> stack = new Stack<>();

    public synchronized Character pop() {
        char c;
        if (stack.empty()) {
            try {
                this.wait();//½øÈëWaiting×´Ì¬
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Character pop = stack.pop();
        return pop;
    }
    public synchronized void push(Character c) {
        this.notify();
        stack.push(c);

    }
}

class Producer implements Runnable{
    private SyncStack stack;
    Producer(SyncStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            char c = (char) ((int)(Math.random() * 26) + 'A');
            Character C = c;
            stack.push(C);
            System.out.println("NO." + i + " Push " + c);
        }
    }
}
class Consumer implements Runnable{
    private SyncStack stack;
    Consumer(SyncStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 200; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Character c = stack.pop();
            System.out.println("             NO." + i + " Pop  " + c);
        }
    }
}
