package IOAndProperties.IO_02_InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/** �ֽ�������һ�ζ�ȡ����ֽڵķ���
 *      `public int read(byte[] b)`��
 *          ���������ж�ȡһ���������ֽڣ�������洢�ڻ���������b��
 *       ��ȷ�������飺
 *          1.�����Ĳ���byte[]�����ã�
 *              �𵽻�������ã��洢ÿ�ζ�ȡ���Ķ���ֽ�
 *              ����ĳ���һ���Ϊ1024��1KB������ʱ1024��������
 *          2.�����ķ���ֵint��ʲô��
 *              ÿ�ζ�ȡ����Ч�ֽڸ���
 *
 *  String��Ĺ��췽����
 *      String(byte[] bytes):���ַ�����ת��Ϊ�ַ���
 *      String(byte[] bytes, int offset, int length):���ַ�����һ����ת��Ϊ�ַ���(offset��ʼ������lengthת�����ֽڸ���)
 *
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        /*a.txt  abcd*/
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_01_OutputStream\\a.txt");
       /*
        ԭ��
                 bytes[0] bytes[1]  len��ȡ����Ч�ֽڸ���
        ��һ�ζ�ȡ    A        B             2
        �ڶ��ζ�ȡ    C        D             2
        �����ζ�ȡ    E                      1
        ���Ĵζ�ȡ                          -1

            ���     E        D
        */
        /*
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

         */

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
    }
}
