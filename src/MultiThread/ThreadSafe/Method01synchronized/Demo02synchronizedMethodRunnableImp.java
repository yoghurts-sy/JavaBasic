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

            System.out.println("����" + Thread.currentThread().getName() + "��������" + i + "��Ʊ");
            i++;
        }
    }


    /*��̬��ͬ������*/
    public  static synchronized void sellTicketStaic() {
        if (i <= ticket) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("����" + Thread.currentThread().getName() + "��������" + i + "��Ʊ");
            i++;
        }
    }

}
