package IOAndFile.IO_04_Writer;

import java.io.FileWriter;
import java.io.IOException;

/** �ַ��������Writer
 *  `java.io.Writer ��
 *  `�������Ǳ�ʾ����д���ַ�����������ĳ��࣬��ָ�����ַ���Ϣд����Ŀ�ĵء�
 *  ���������ֽ�������Ļ������Թ��ܷ�����
 *      `void write(int c)` д�뵥���ַ���
 *      `void write(char[] cbuf) `д���ַ����顣
 *      `abstract  void write(char[] cbuf, int off, int len) `д���ַ������ĳһ����,off����Ŀ�ʼ����,lenд���ַ�������
 *      `void write(String str) `д���ַ�����
 *      `void write(String str, int off, int len)` д���ַ�����ĳһ����,off�ַ����Ŀ�ʼ����,lenд���ַ�������
 *      `void flush() `ˢ�¸����Ļ��塣
 *      `void close()` �رմ�������Ҫ��ˢ������
 *
 *  FileWriter���ļ��ַ������
 *  ���ã����ڴ��е��ַ�����д�뵽�ļ���ȥ
 *  ���췽����
 *      FileWriter(File file):File file��һ���ļ�
 *      FileWriter(String fileName):String fileName�ļ�·��
 *      ���췽�������ã�
 *          1.����һ��FileWriter����
 *          2.����ݹ��췽���д��ݵ��ļ�/�ļ���·���������ļ�
 *          3.���FileWriter����ָ�򴴽��õ��ļ�
 *
 *  �ַ������ʹ�ò��裨�ص㣩
 *      1.����FileWriter���󣬹��췽���а�Ҫд�������Ŀ�ĵ�
 *      2.ʹ��FileWriter�е�write������������д���ڴ�Ļ��������ַ�ת��Ϊ�ֽڣ�
 *      3.ʹ��FileWriter�е�flush���������ڴ滺�����е����ݣ�ˢ�µ��ļ���
 *      4.�ͷ���Դ�����ûʹ��flush������Ҳ����ڴ滺�����е�����ˢ�µ��ļ��У�
 *
 */
public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_04_Writer\\test.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
