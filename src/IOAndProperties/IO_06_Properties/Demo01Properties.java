package IOAndProperties.IO_06_Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/** Properties extends Hashtable<k, v> implements Map<k, v>
 *      继承于` Hashtable` ，来表示一个持久的属性集。
 *      它使用键值结构存储数据，每个键及其对应值都是一个字符串。
 *      该类也被许多Java类使用，比如获取系统属性时，`System.getProperties` 方法就是返回一个`Properties`对象。
 *
 *      - `public Object setProperty(String key, String value)` ： 保存一对属性。
 *      - `public String getProperty(String key) ` ：使用此属性列表中指定的键搜索属性值。
 *      - `public Set<String> stringPropertyNames() ` ：所有键的名称的集合。
 *
 *      泛型都是默认字符串
 *
 *      可以使用Properties集合中的方法store，把集合中的临时数据写入硬盘中存储
 *      store(OutputStream out, String comments)
 *      store(Writer writer, String comments)
 *      参数：
 *          OutputStream out：字节输出流，不能写入中文
 *          Writer writer：字符输出流，可以写中文
 *          String comments:注释，不能使用中文，因为默认Unicode编码
 */
public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }

    private static void show01() {
        Properties properties = new Properties();

        properties.setProperty("赵丽颖","170");
        properties.setProperty("迪丽热巴","171");
        properties.setProperty("马尔扎哈","Infinity");

        Set<String> strings = properties.stringPropertyNames();
        for (String key : strings) {
            String value = properties.getProperty(key);
            System.out.println(key + value);
        }
    }

    private static void show02() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("赵丽颖","170");
        properties.setProperty("迪丽热巴","171");
        properties.setProperty("马尔扎哈","Infinity");

        FileWriter fw  =  new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop.txt");
        properties.store(fw ,"2020/5/9");

        fw.close();

    }

    private static void show03() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("赵丽颖","170");
        properties.setProperty("迪丽热巴","171");
        properties.setProperty("马尔扎哈","Infinity");

        properties.store(new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop2.txt"), "2020/5/9");
        //会自动释放资源
    }
}
