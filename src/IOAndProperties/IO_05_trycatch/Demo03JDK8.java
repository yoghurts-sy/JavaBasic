package IOAndProperties.IO_05_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** JDK8������
 *  tryǰ����Զ���������
 *  ��try��ߵ�(a; b; ...)�п���ֱ������������ı�����
 *   ���������Ҳ���Զ��ͷ�
 */
public class Demo03JDK8 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_05_trycatch\\test.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_05_trycatch\\new test.txt");
        try (fis;fos) {
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
