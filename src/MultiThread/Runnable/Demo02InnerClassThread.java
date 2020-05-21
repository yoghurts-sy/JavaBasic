package MultiThread.Runnable;

/**
 *  匿名内部类方式实现线程的创建
 *      作用：
 *          简化代码
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
