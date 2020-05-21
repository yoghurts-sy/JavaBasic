package MultiThread.Thread;

/**
 *
 */
public class Demo01myThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Thread->" + i);
        }
    }
}
