package MultiThread.Thread;

/** public static void sleep(long millis):
 *      使当前正在执行的线程以指定的毫秒数暂停
 *
 *      模拟秒表
 */
public class Demo03sleep {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
