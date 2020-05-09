package IOAndProperties.IO_06_Properties;

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
 */
public class Demo01Properties {
    public static void main(String[] args) {
        show01();
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
}
