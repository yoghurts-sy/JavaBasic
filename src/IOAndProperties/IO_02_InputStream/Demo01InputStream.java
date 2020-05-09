package IOAndProperties.IO_02_InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/** `java.io.InputStream:
 *  `�������Ǳ�ʾ�ֽ���������������ĳ��࣬���Զ�ȡ�ֽ���Ϣ���ڴ��С���
 *   �������ֽ��������Ļ������Թ��ܷ���:
 *      `public void close()` ���رմ����������ͷ��������������κ�ϵͳ��Դ��
 *      `public abstract int read()`�� ����������ȡ���ݵ���һ���ֽڡ�
 *      `public int read(byte[] b)`�� ���������ж�ȡһЩ�ֽ������������Ǵ洢���ֽ����� b�� ��
 *
 *   java.io.InputStream extends InputStream
 *   FileInputStream:�ļ��ֽ�������
 *      ���ã�
 *          ��Ӳ���ļ��е����ݣ���ȡ���ڴ���ʹ��
 *      ���췽����
 *          FileInputStream(String name)
 *          FileInputStream(File file)
 *          ������
 *              String name���ļ���·��
 *              File file���ļ�
 *          ���ã�
 *              1.����һ��FileInputStream����
 *              2.��FileInputStream����ָ���Ĺ��췽����Ҫ��ȡ���ļ�
 *
 *    ��ȡ���ݵ�ԭ��Ӳ��-->�ڴ棩
 *          Java����-->JVM-->os-->os��ȡ���ݵķ���-->��ȡ�ļ�
 *
 *    �ֽ���������ʹ�ò��裺
 *          1.����FileInputStream���󣬹��췽��Ҫ�󶨶�ȡ������Դ
 *          2.ʹ��FileInputStream�еķ���read
 *          3.�ͷ���Դ
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_01_OutputStream\\a.txt");
        int len = 0;
        /*���ƶ�����β����һλʱ��Ϊ-1��������ǣ�*/
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }
        System.out.println(fis.read());
        System.out.println(fis.read());
        fis.close();
    }
}
