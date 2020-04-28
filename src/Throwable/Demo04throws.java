package Throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

/** throws�ؼ���:�쳣����ĵ�һ�ַ������������˴���
 *      ע�⣺1.throws�ؼ��ֱ���д�ڷ���������
 *           2.throws�ؼ��ֺ����������������Exception������Exception������
 *           3.������Ҫ�׳�����쳣ʱ��throws���������쳣
 *              ����Щ�쳣�����Ӹ����ϵʱ��д���༴��
 *           4.��������һ�������׳��쳣�ķ���ʱ�����Ǿͱ���������д���
 *              Ҫô����ʹ��throws�ؼ����׳������������ĵ����ߴ������ս���JVM����
 *              Ҫôʹ��try...catch����
 */
public class Demo04throws {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tdt");
    }
    //public static void readFile(String FileName) throws FileNotFoundException,IOException {
    public static void readFile(String FileName) throws IOException {
        /*�׳����쳣���Ⱥ�Ĵ���*/
        if (!FileName.endsWith(".txt")){
            throw new IOException("�ļ���׺������");
        }

        if (!FileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("�����ļ�·������c:\\a.txt");
        }
    }
}
