package Exception;

import java.util.List;

/**
 * �Ӹ�����쳣
 */
public class Demo06extends {
    public void show01() throws NullPointerException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws NullPointerException{}
    public void show04() {}
}
class son extends Demo06extends {
    //������д���෽���׳��͸���һ�����쳣
    @Override
    public void show01() throws NullPointerException {
    }
    //������д�����쳣ʱ�������׳������쳣������
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
    }
    //������д������Բ��׳��쳣
    @Override
    public void show03() {
    }
    //���಻�׳��쳣ʱ������ֻ�ܲ����쳣
    @Override
    public void show04() {
        try {
            List<Integer> integers = List.of(1, 2, 3);
            System.out.println(integers.get(3));
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
