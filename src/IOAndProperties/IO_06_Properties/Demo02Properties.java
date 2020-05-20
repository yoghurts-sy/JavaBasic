package IOAndProperties.IO_06_Properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/** 可以使用Properties集合中的方法store，把集合中的数据永久写入到硬盘中存储
 *      void store(OutputStream out, String commits)
 *      void store(Write writer, String commits)
 *      参数：
 *          OutputStream out：字节输出流，不能写入中文
 *          Write writer：字符输出流，可以写入中文
 *          String commits：注释，用来解释说明保存的文件是做什么用的
 *                          不能使用中文，会产生乱码，以为默认是Unicode编码
 *                          一般使用空字符串
 *
 *       使用步骤：
 *              1.创建Properties集合对象，添加数据
 *              2.创建字节输出流/字符输出流对象，构造方法中绑定要输出的目的地
 *              3.使用Properties集合中的方法store，把集合中的临时数据，持久化的写入硬盘中
 *              4.释放资源
 *
 */
public class Demo02Properties {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
    }
    private static void show01() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("南宁","我家乡");
        prop.setProperty("广州","人情味浓");
        prop.setProperty("深圳","适合奋斗");

        prop.store(new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop3.txt"), "save data");

    }
    private static void show02() throws IOException {/*乱码*/
        Properties prop = new Properties();
        prop.setProperty("南宁","我家乡");
        prop.setProperty("广州","人情味浓");
        prop.setProperty("深圳","适合奋斗");

        prop.store(new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndProperties\\IO_06_Properties\\prop4.txt"), "save data");

    }
}
