package Exception;

/**
 * �쳣������ԭ��
 *      ��һ����JVM�������������쳣
 *            1.JVM������쳣������ԭ�򴴽�һ���쳣��������쳣��������쳣�����ģ����ݣ�ԭ��λ�ã�
 *                  new ArrayIndexOutOfBoundsException("3");
 *            2.��getElement�����У�û���쳣�Ĵ����߼���try...catch��
 *            ��ôJVM�ͻὫ����쳣�����׳��������ĵ�����main����
 *      �ڶ�����main�������ܵ�����쳣���󣬵���main������Ҳû���쳣�����߼�
 *            ����������쳣�����׳���main�����ĵ�����JVM����
 *      ��������JVM���ܵ���
 *            1.���쳣����ģ����ݣ�ԭ��λ�ã��Ժ�ɫ�����ӡ�ڿ���̨
 *            2.JVM��ֹ��ǰ���ڽ���Java���򣬼��жϴ���
 *
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(getElement(arr, 3));
    }
    public static int getElement(int[] arr, int index){
        return arr[index];
    }
}
