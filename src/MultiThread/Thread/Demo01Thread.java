package MultiThread.Thread;

/** �������̵߳ĵ�һ�ַ���������Thread�������
 *      java.lang.Thread�ࣺ�������̵߳��࣬������Ҫʵ�ֶ��̵߳ĳ��򣬾ͱ���̳�Thread��
 *
 *      ʵ�ֲ��裺
 *          1.����һ��Thread������
 *          2.��Thread�����������дrun�����������߳����񣨼������߳�Ҫ��ʲô����
 *          3.����Thread������Ķ���
 *          4.����Thread���е�start�����������µ��̣߳�ִ��run����
 *              void start()ʹ���߳̿�ʼִ�С�Java��������ø��̵߳�run����
 *              ����������̲߳��������У���ǰ�̣߳�main�̣߳�����һ���̣߳����������̣߳�
 *              �������һ���߳��ǷǷ��ģ��ر��ǵ�ǰ�߳��Ѿ�����ִ�к󣬲����ٴ�����
 *
 *          java����������ռʽ���ȣ���һ���̵߳����ȼ��ߣ�������ִ�С����ͬ���ȼ������ѡ��һ��ִ�С�
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Demo01myThread demo01myThread = new Demo01myThread();
        demo01myThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main->" + i);
        }
    }
}
