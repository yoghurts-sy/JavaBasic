package MultiThread.Thread;

/** public static void sleep(long millis):
 *      ʹ��ǰ����ִ�е��߳���ָ���ĺ�������ͣ
 *
 *      ģ�����
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
