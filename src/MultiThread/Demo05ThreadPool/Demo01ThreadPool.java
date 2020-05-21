package MultiThread.Demo05ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** �̳߳أ�JDK1.5֮���ṩ��
 *  java.util.concurrent.Executors���̳߳صĹ����࣬���������̳߳�
 *  Executors���еľ�̬������
 *      static ExecutorService newFixedThreadPool(int nThreads)
 *           ����һ�������ù̶��߳������̳߳أ��Թ�����޽���з�ʽ��������Щ�̡߳�
 *      ������
 *          int nThreads�������̳߳��а������߳�����
 *      ����ֵ��
 *          ExecutorService�ӿڣ����ص���ExecutorService�ӿڵ�ʵ�������
 *          ���ǿ���ʹ��ExecutorService�ӿ������գ�����ӿڱ�̣�
 *
 *   java.util.concurrent.ExecutorService���̳߳ؽӿ�
 *      �����ӻ�ȡ�̳߳��л�ȡ�̣߳�����start������ִ���߳�����
 *             submit(Runnable task) �ύһ�� Runnable ��������ִ��
 *             shutdown()���ر��̳߳أ�������ʹ��
 *
 *  ʹ�ò��裺
 *     1.ʹ���̳߳صĹ�����Executors����ṩ�ľ�̬����newFixedThreadPool����һ��ָ���������̳߳�
 *     2.����һ���࣬ʵ��Runnable�ӿڣ���дrun�����������߳�����
 *     3.���� ExecutorService�ӿ���submit�����������߳����񣬿����߳�
 *
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
    }
}
