package MultiThread.ThreadSafe.Method01synchronized;

/** ����̰߳�ȫ�صڶ��ַ�����
 * ��1��ʹ��ͬ������
 *      ��ʽ��
 *          ���η� synchronized ����ֵ���� ������(�����б�) {
 *              ���ܳ����̰߳�ȫ����Ĵ��루�����˹������ݵĴ��룩
 *          }
 *
 *      ͬ����������������˭��
 *          ����ʵ�������this
 *
 *  ��2��ʹ�þ�̬ͬ������
 *      ��������˭��
 *          ����this��this�Ǵ�������֮������ģ���̬���������ڶ���
 *          �����������Ǳ����class����Demo02synchronizedMethodRunnableImp.class�����䣩
 */
public class Demo02synchronizedMethod {
    public static void main(String[] args) {
        Demo02synchronizedMethodRunnableImp run = new Demo02synchronizedMethodRunnableImp();
        Thread thread01 = new Thread(run);
        Thread thread02 = new Thread(run);
        Thread thread03 = new Thread(run);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
