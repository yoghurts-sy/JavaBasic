package IOAndProperties.IO_06_Properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/** ����ʹ��Properties�����еķ���store���Ѽ����е���������д�뵽Ӳ���д洢
 *      void store(OutputStream out, String commits)
 *      void store(Write writer, String commits)
 *      ������
 *          OutputStream out���ֽ������������д������
 *          Write writer���ַ������������д������
 *          String commits��ע�ͣ���������˵��������ļ�����ʲô�õ�
 *                          ����ʹ�����ģ���������룬��ΪĬ����Unicode����
 *                          һ��ʹ�ÿ��ַ���
 *
 *       ʹ�ò��裺
 *              1.����Properties���϶����������
 *              2.�����ֽ������/�ַ���������󣬹��췽���а�Ҫ�����Ŀ�ĵ�
 *              3.ʹ��Properties�����еķ���store���Ѽ����е���ʱ���ݣ��־û���д��Ӳ����
 *              4.�ͷ���Դ
 *
 */
public class Demo02Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
    }
    private static void show01() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("����","�Ҽ���");
        prop.setProperty("����","����ζŨ");
        prop.setProperty("����","�ʺϷܶ�");

        prop.store(new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop3.txt"), "save data");

    }
    private static void show02() throws IOException {/*����*/
        Properties prop = new Properties();
        prop.setProperty("����","�Ҽ���");
        prop.setProperty("����","����ζŨ");
        prop.setProperty("����","�ʺϷܶ�");

        prop.store(new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop4.txt"), "save data");

    }
}
