package MultiThread.ThreadSafe.Method01synchronized;

public class Demo02synchronizedMethodRunnableImp implements Runnable{
    private static int ticket = 100;
    private static int i = 1;

    @Override
    public void run() {
        while (true) {
            sellTicketStaic();
        }
    }

    public synchronized void sellTicket() {
        if (i <= ticket) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "正在卖第" + i + "张票");
            i++;
        }
    }


    /*静态的同步方法*/
    public  static synchronized void sellTicketStaic() {
        if (i <= ticket) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口" + Thread.currentThread().getName() + "正在卖第" + i + "张票");
            i++;
        }
    }

}
