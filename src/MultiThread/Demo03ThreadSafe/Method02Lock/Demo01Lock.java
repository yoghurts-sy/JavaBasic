package MultiThread.Demo03ThreadSafe.Method02Lock;

/** ����̵߳ĵ����ַ�����ʹ��Lock��
 *      java.util.concurrent.Locks.Lock�ӿ�
 *      Lock�ӿ��еķ�����
 *          void lock():��ȡ��
 *          void unlock():�ͷ���
 *
 *      ʹ�ò��裺
 *          1.�ڳ�Աλ�ô���һ��ReentrantLock����
 *          2.�ڿ��ܻ���ְ�ȫ����Ĵ���ǰ����Lock�ӿ��е�lock������ȡ��
 *          3.�ڿ��ܻ���ְ�ȫ����Ĵ�������Lock�ӿ��е�lock�����ͷ���
 *
 */
public class Demo01Lock {
    public static void main(String[] args) {
        Demo01LockRunnableImp run = new Demo01LockRunnableImp();
        Thread thread01 = new Thread(run);
        Thread thread02 = new Thread(run);
        Thread thread03 = new Thread(run);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
