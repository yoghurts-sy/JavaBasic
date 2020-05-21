package MultiThread.Demo03ThreadSafe.Method02Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo01LockRunnableImp implements Runnable{
    private int ticket = 100;
    private int i = 1;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (i <= ticket) {
                try {
                    Thread.sleep(10);
                    System.out.println("窗口" + Thread.currentThread().getName() + "正在卖第" + i + "张票");
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}
