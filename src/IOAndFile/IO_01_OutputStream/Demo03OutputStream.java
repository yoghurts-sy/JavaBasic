package IOAndFile.IO_01_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**  ��д:ʹ�����������Ĺ��췽��
 *      `public FileOutputStream(File file, boolean append)`�� �����ļ��������д����ָ���� File�����ʾ���ļ���
 *      `public FileOutputStream(String name, boolean append)`�� �����ļ��������ָ��������д���ļ���
 *   ������
 *      String name��File file��д�����ݵ�Ŀ�ĵ�
 *      boolean append:׷��д�Ŀ���
 *          true��׷��д
 *          false������һ�����ļ�������Դ�ļ�
 *
 *   д���У�
 *      window��\r\n
 *      Linux:/n
 *      mac:\r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\OutputStream\\c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("���".getBytes());
            fos.write("\r\n".getBytes());
        }
        for (int i = 0; i < 10; i++) {
            fos.write("���".getBytes());
        }
        fos.close();
    }
}
