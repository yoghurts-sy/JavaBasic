package MultiThread.Thread;

/** ��ȡ�̵߳����ƣ�
 *      1.ʹ��Thread���еķ���getName()
 *          String getName()���ظ��̵߳�����
 *      2.�����Ȼ�ȡ����ǰ����ִ�е��̣߳�ʹ���߳��еķ���getName()��ȡ�̵߳�����
 *
 *  �����߳����ƣ�
 *      1.ʹ��Thread���еķ���setName()
 *      2.�ڼ̳�Thread��������д���һ���������Ĺ��췽�������������̵߳����ƣ�
 *          �ڵ��ø���������Ĺ��췽�������߳����ƴ��ݸ�����
 */
public class Demo02GetThreadName {
    public static void main(String[] args) {
        Demo02myThread demo02myThread = new Demo02myThread();
        demo02myThread.setName("С��");
        demo02myThread.start();

        new Demo02myThread("С��").start();
        System.out.println(Thread.currentThread().getName());
    }
}
