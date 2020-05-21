package MultiThread.Demo06Lambda;

/**
 * JDK 8������
 *      Lambda���ʽ�ı�׼��ʽ��
 *          ����������ɣ�
 *              (1)һЩ����
 *              (2)һ����ͷ
 *              (3)һ�δ���
 *           ��ʽ��
 *              (�����б�) -> {һЩ��д�ķ���}
 *           ():�����б�
 *           ->:���ݵ���˼
 *           {}:��д�ӿڵĳ��󷽷���
 *
 *     ʹ��Lambda��ǰ�᣺
 *          1.�����нӿڣ�����ʽ�ӿڣ����ҽӿ�����ֻ��һ�����󷽷�
 *          2.Ҫ�򻯱�������������Ƶ�
 *
 *      ��Lambda��
 *          ����ʡ�Ե����ݣ�
 *              1.�������б��������в����б���������ͣ�����ʡ�Բ�д
 *              2.�������б��������еĲ������ֻ��һ������ô���ͺͣ���������ʡ��
 *              3.��һЩ���룩����������еĴ���ֻ��һ�������Ƿ��з���ֵ{}��return������������һ��ʡ�ԡ�
 *
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() /*ע���������*/{
                System.out.println(Thread.currentThread().getName() + "������");
            }
        }).start();

        new Thread(()->{/*ע���������*/
            System.out.println(Thread.currentThread().getName() + "������");
        }).start();

        /*��*/
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "������")).start();
    }
}
