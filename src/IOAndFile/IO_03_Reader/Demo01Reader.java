package IOAndFile.IO_03_Reader;

import java.io.FileReader;
import java.io.IOException;

/** �ַ���������Reader
 *      ��ʹ���ֽ�����ȡ�ı��ļ�ʱ�����ܻ���һ��С���⡣�������������ַ�ʱ��
 *      ���ܲ�����ʾ�������ַ���������Ϊһ�������ַ�����ռ�ö���ֽڴ洢��
 *      ����Java�ṩһЩ�ַ����࣬���ַ�Ϊ��λ��д���ݣ�ר�����ڴ����ı��ļ���
 *
 *  `java.io.Reader`�������Ǳ�ʾ���ڶ�ȡ�ַ�����������ĳ��࣬���Զ�ȡ�ַ���Ϣ���ڴ��С�
 *   ���������ַ��������Ļ������Թ��ܷ�����
 *      `public void close()` ���رմ������ͷ��������������κ�ϵͳ��Դ��
 *      `public int read()`�� ����������ȡһ���ַ���
 *      `public int read(char[] cbuf)`�� ���������ж�ȡһЩ�ַ����������Ǵ洢���ַ����� cbuf��
 *
 *  FileReader���ļ��ַ�������
 *         ���ã���Ӳ���ļ��е��������ַ��ķ�ʽ�����ڴ���
 *         ���췽����
 *               FileReader(String filename):String filename:�ļ�·��
 *               FileReader(File file)��File file��һ���ļ�
 *               ���췽�������ã�
 *                  1.����һ��FileReader����
 *                  2.���FileReader����ָ��Ҫ�����ļ�
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_03_Reader\\test.txt");

        char[] cbuffer = new char[1024];
        int len = 0;
        while ((len = fr.read(cbuffer)) != -1){
            System.out.print(new String(cbuffer, 0, len));
        }

        fr.close();
    }
}
