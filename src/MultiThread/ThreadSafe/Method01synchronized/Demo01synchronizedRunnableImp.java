package MultiThread.ThreadSafe.Method01synchronized;

public class Demo01synchronizedRunnableImp implements Runnable{
    private int ticket = 100;
    private int i = 1;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
               if (i <= ticket) {
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

                   System.out.println("窗口" + Thread.currentThread().getName() + "正在卖第" + i + "张票");
                   i++;
               }
               else {
                   break;
               }
            }
        }
    }
}
