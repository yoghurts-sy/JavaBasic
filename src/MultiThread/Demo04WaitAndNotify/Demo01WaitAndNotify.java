package MultiThread.Demo04WaitAndNotify;

/** �ȴ����Ѱ���
 *      ����һ���˿��̣߳������ߣ�����֪�ϰ���ӵ����������������wait����������cpu��ִ�У����뵽WAITING״̬
 *      ����һ���ϰ��̣߳������ߣ�����5�������ӣ����ð��Ӻ󣬵���notify���������ѹ˿ͳ԰���
 *   ע�⣺
 *      �˿ͺ��ϰ���̱߳���ʹ��ͬ������������������֤�ȴ��ͻ���ֻ����һ����ִ��
 *      **ͬ��ʹ�õ�������Ψһ**
 *      ֻ����������ܵ���wait��notify������������������д��ͬ���������
 *
 *      Object���еķ���
 *      void wait()
 *          1.�������̵߳��ô˶���notify()������notifyAll()����ǰ�����µ�ǰ�̵߳ȴ�
 *          2.�����Դ�����룬��ʱ�䵽ʱ��δ�����ѣ������߳�
 *     void notify()
 *          �����ڴ˶���������ϵȴ��ĵ����̣߳����ж���������һ��
 *          ��ִ��wait����֮��Ĵ���
 *     void notifyAll()
 *          �����ڴ˶���������ϵȴ��������߳�
 *
 *
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("��֪�ϰ���ӵ����������");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("�����Ѿ������ˣ����ԣ�");
                        System.out.println("------------");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("��5�������ӣ����ð��ӻ��ѹ˿ͳ԰���");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
