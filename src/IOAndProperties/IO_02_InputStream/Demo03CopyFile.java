package IOAndProperties.IO_02_InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** 复制文件练习：
 *      一读一写
 *
 *     文件复制的步骤：
 *          1.创建一个字节输入流对象，构造方法中绑定要读取的数据
 *          2.创建一个字节输出流对象，构造方法中要绑定写入的目的地(记得加文件名)
 *          3.使用字节输入流的read方法
 *          4.使用字节输出流的write方法
 *          5.释放资源
 */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\yoghurt.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_02_InputStream\\yoghurt.jpg");

        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("所花时间：" + (end - start) + "毫秒");
    }
}
