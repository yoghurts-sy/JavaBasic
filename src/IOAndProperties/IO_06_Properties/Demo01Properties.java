package IOAndProperties.IO_06_Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/** Properties extends Hashtable<k, v> implements Map<k, v>
 *      �̳���` Hashtable` ������ʾһ���־õ����Լ���
 *      ��ʹ�ü�ֵ�ṹ�洢���ݣ�ÿ���������Ӧֵ����һ���ַ�����
 *      ����Ҳ�����Java��ʹ�ã������ȡϵͳ����ʱ��`System.getProperties` �������Ƿ���һ��`Properties`����
 *
 *      - `public Object setProperty(String key, String value)` �� ����һ�����ԡ�
 *      - `public String getProperty(String key) ` ��ʹ�ô������б���ָ���ļ���������ֵ��
 *      - `public Set<String> stringPropertyNames() ` �����м������Ƶļ��ϡ�
 *
 *      ���Ͷ���Ĭ���ַ���
 *
 *      ����ʹ��Properties�����еķ���store���Ѽ����е���ʱ����д��Ӳ���д洢
 *      store(OutputStream out, String comments)
 *      store(Writer writer, String comments)
 *      ������
 *          OutputStream out���ֽ������������д������
 *          Writer writer���ַ������������д����
 *          String comments:ע�ͣ�����ʹ�����ģ���ΪĬ��Unicode����
 *
 *
 *      ����ʹ��Properties�����еķ���load����Ӳ���е��ļ�����ֵ�ԣ�,��ȡ��������ʹ��
 *          void load(InputStream inStream)���ֽ������������ܶ�ȡ�������ĵļ�ֵ��
 *          void load(Reader reader)���ַ����������ܶ�����
 *      ע�⣺
 *          1.�洢��ֵ�Ե��ļ��У�����ֵĬ�ϵ����ӷ��ſ���ʹ��=��ո��������ţ�
 *          2.�洢��ֵ�Ե��ļ��У�����ʹ��#����ע�ͣ���ע�͵ļ�ֵ�Բ����ڱ���ȡ
 *          3.�洢��ֵ�Ե��ļ��У�����ֵĬ�϶����ַ����������ټ�����
 *
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {

        show01();
        show02();
        show03();
        show04();
    }


    private static void show01() {
        Properties properties = new Properties();

        properties.setProperty("����ӱ","170");
        properties.setProperty("�����Ȱ�","171");
        properties.setProperty("�������","Infinity");

        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            String value = properties.getProperty(key);
            System.out.println(key + value);
        }
    }

    private static void show02() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("����ӱ","170");
        properties.setProperty("�����Ȱ�","171");
        properties.setProperty("�������","Infinity");

        FileWriter fw  =  new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop.txt");
        properties.store(fw ,"2020/5/9");

        fw.close();

    }

    private static void show03() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("����ӱ","170");
        properties.setProperty("�����Ȱ�","171");
        properties.setProperty("�������","Infinity");

        properties.store(new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop2.txt"), "2020/5/9");
        //���Զ��ͷ���Դ
    }

    private static void show04() throws IOException {
        System.out.println("--------------");
        Properties properties = new Properties();

        properties.load(new FileReader("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop2.txt"));
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
