package IOAndFile.IO_04_Writer;

import java.io.FileWriter;
import java.io.IOException;

/** �ַ������д����
 *      `void write(char[] cbuf) `д���ַ����顣
 *      `abstract  void write(char[] cbuf, int off, int len) `д���ַ������ĳһ����,off����Ŀ�ʼ����,lenд���ַ�������
 *      `void write(String str) `д���ַ�����
 *      `void write(String str, int off, int len)` д���ַ�����ĳһ����,off�ַ����Ŀ�ʼ����,lenд���ַ�������
 *
 *
 */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_04_Writer\\test2.txt");
        /*
        char[] cbuf = {'1', '2', '3', '4'};
        fw.write(cbuf, 0, 4);
        */
        String sbuf = "��ð���";
        fw.write(sbuf, 0, sbuf.length());

        fw.close();
    }
}
