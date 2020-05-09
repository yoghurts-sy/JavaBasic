package IOAndProperties.IO_01_OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**  д���ֽڵķ���:
 *   `public void write(byte[] b)`���� b.length�ֽڴ�ָ�����ֽ�����д����������
 *   `public void write(byte[] b, int off, int len)` ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
 *
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\OutputStream\\b.txt"));
        /**
         * �����⣺���ļ�����ʾ100��3���ֽ�
         * `public void write(byte[] b)`
         *  ���д�ĵ�һ���ֽ���������0~127������ô��ʾ��ʱ��ͻ��ѯASC���
         *  ���д�ĵ�һ���ֽ��Ǹ������ǵ�һ���ֽڻ�Ϊ��͵ڶ����ֽ����������ʾ��ѯGBK(�����ֽ�������)
         */
        byte[] bytes = {-65, 66, -67, 68, 69};
        fos.write(bytes);
        /**
         * `public void write(byte[] b, int off, int len)`
         * off:���Ŀ�ʼ
         * len��д�����ֽ�
         */
        fos.write(bytes, 1, 2);

        byte[] bytes2 = "520����".getBytes();
        fos.write(bytes2);
        fos.close();
    }
}
