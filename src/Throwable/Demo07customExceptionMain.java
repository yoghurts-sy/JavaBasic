package Throwable;

import java.util.Scanner;

/*
DemoҪ������ģ��ע�����������û����Ѿ����ڣ����׳��쳣��ʾ���ף����û����Ѿ���ע����
        *
        *      ������
        *          1.ʹ�����鱣���Ѿ�ע������û���
        *          2.Scanner����
        *          3.����һ���������Ƿ������ж�
        *              true��
        *                  �׳�customException
        *              false��
        *                  ���������Ƚ�
        *           ����ѭ��"��ϲ����ע��ɹ�"
 */
public class Demo07customExceptionMain {
    private static String[] usernames = {"����", "����", "����"};
    private static void checkUsernames(){
        String name = getInput();
        for (String username : usernames) {
            if (username.equals(name)) {
                try {
                    throw new Demo07customException("�ף����û����Ѿ���ע����!");
                } catch (Demo07customException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("��ϲ����ע��ɹ�");
    }
    private static String getInput(){
        System.out.println("��������Ҫע����û���:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        checkUsernames();
    }
}
