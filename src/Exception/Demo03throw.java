package Exception;

import java.util.Objects;

/** �׳��쳣��throw�ؼ���
 *      ���ã�����ʹ��throw�ؼ�����ָ���������׳�ָ���쳣
 *      ��ʽ��throw new xxxException��"�쳣������ԭ��"��
 *      ע�⣺1.throw�ؼ��ֱ���д�ڷ������ڲ�
 *           2.throw�ؼ���new�Ķ��������Exception����Exception���������
 *           3.throw�׳����쳣�����Ǳ���������д���
 *              ��1�����throw�ؼ��ֺ�ߵĴ�������RuntimeException������RuntimeException�����࣬���ǿ��Բ�����������JVM����(��ӡ�쳣�����жϳ���)
 *               (2)����Ǳ����쳣����throws ��try...catch
 */
public class Demo03throw {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //System.out.println(getElement(arr, 3));
        method(null);
    }
    public static int getElement(int[] arr, int index){
        if (arr == null) {
            throw new NullPointerException("���ݵ�����ֵΪnull");
        }
        if (index < 0 || index > arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("����Խ���쳣");
        }
        return arr[index];
    }

    public static void method(Object obj){
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "���ݵ�ֵΪnull");
    }
}
