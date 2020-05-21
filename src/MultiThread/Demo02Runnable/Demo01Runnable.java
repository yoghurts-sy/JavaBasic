package MultiThread.Demo02Runnable;

/** �������̵߳ĵڶ��ַ�����ʵ��Runnable�ӿ�
 *      java.lang.Runnable��
 *          Runnable�ӿ�Ӧ������Щ����ͨ��ĳһ�߳�ִ����ʵ��������ʵ��
 *          �����ʵ��һ��run���޲η�����
 *       java.lang.Thread��Ĺ��췽��
 *          Thread(Runnable target)�����µ�Thread����
 *          Thread(Runnable target, String Name)�����µ�Thread����
 *
 *       ʵ�ֲ��裺
 *          1.�����µ�Runnable�ӿڵ�ʵ����
 *          2.��ʵ��������дrun�����������߳�����
 *          3.����һ��Runnable�ӿڵ�ʵ�������
 *          4.����Thread����󣬹��췽���д���Runnable�ӿڵ�ʵ�������
 *          5.����Thread���е�start����
 *
 *     ʵ��Runnable�ĺô���
 *          1.�����˵��̳еľ�����
 *              һ����ֻ�ܼ̳�һ���࣬��̳���Thread��Ͳ��ܼ̳�������
 *              ʵ��Runnable�ӿڣ������Լ̳��������࣬ʵ�������Ľӿ�
 *          2.��ǿ�˳������չ�ԣ������˳��������ԣ����
 *              ʵ��Runnable�ӿڵķ�ʽ���������߳�����Ϳ������߳̽����˷��루���
 *              ʵ�����У���д��run���������������߳�����
 *              ����Thread����󣬵���start�����������µ��߳�
 *
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }

        Demo01RunnableImp demo01RunnableImp = new Demo01RunnableImp();
        Thread thread = new Thread(demo01RunnableImp);
        thread.start();
    }
}
