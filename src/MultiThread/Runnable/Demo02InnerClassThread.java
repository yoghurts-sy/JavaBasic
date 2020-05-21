package MultiThread.Runnable;

/**
 *  �����ڲ��෽ʽʵ���̵߳Ĵ���
 *      ���ã�
 *          �򻯴���
 */
public class Demo02InnerClassThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        });
        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
