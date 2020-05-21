package MultiThread.ThreadSafe.Method01synchronized;

/** ��Ʊ����
 *
 *      ����̰߳�ȫ�����һ�ַ�����ʹ��ͬ�������
 *      ��ʽ��
 *          synchronized(������) {
 *              ���ܳ����̰߳�ȫ����Ĵ��루�����˹������ݵĴ��룩
 *          }
 *
 *       ע�⣺
 *          1.ͬ��������е������󣬿���ʹ������Ķ���
 *          2.���Ǳ��뱣֤����߳�ʹ�õĶ�����ͬһ����
 *          3.����������ã�
 *              ��ͬ���������ס��ֻ��һ���߳���ͬ���������ִ��
 *
 *       ԭ��
 *          �߳�1�Ȼ���synchronized���Ƿ�����
 *              ����У����ȡ�����󣬽��뵽ͬ����ִ��
 *              ���û�У�����������״̬��һֱ�ȴ����������̹߳黹��
 *
 *       ����ͬ���е��̣߳�û��ִ����ϲ����ͷ�����ͬ������߳�û��������ȥͬ��
 *
 *       ȱ�㣺�����Ƶ�����ж�������ȡ�����ͷ����������Ч�ʾͻή��
 *
 */
public class Demo01synchronized {
    public static void main(String[] args) {
        Demo01synchronizedRunnableImp run = new Demo01synchronizedRunnableImp();
        Thread thread01 = new Thread(run);
        Thread thread02 = new Thread(run);
        Thread thread03 = new Thread(run);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
