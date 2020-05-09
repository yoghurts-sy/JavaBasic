package IOAndProperties.IO_02_InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/** `java.io.InputStream:
 *  `抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它
 *   定义了字节输入流的基本共性功能方法:
 *      `public void close()` ：关闭此输入流并释放与此流相关联的任何系统资源。
 *      `public abstract int read()`： 从输入流读取数据的下一个字节。
 *      `public int read(byte[] b)`： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。
 *
 *   java.io.InputStream extends InputStream
 *   FileInputStream:文件字节输入流
 *      作用：
 *          把硬盘文件中的数据，读取到内存中使用
 *      构造方法：
 *          FileInputStream(String name)
 *          FileInputStream(File file)
 *          参数：
 *              String name：文件的路径
 *              File file：文件
 *          作用：
 *              1.构造一个FileInputStream对象
 *              2.对FileInputStream对象指定的构造方法中要读取的文件
 *
 *    读取数据的原理（硬盘-->内存）
 *          Java程序-->JVM-->os-->os读取数据的方法-->读取文件
 *
 *    字节输入流的使用步骤：
 *          1.创建FileInputStream对象，构造方法要绑定读取的数据源
 *          2.使用FileInputStream中的方法read
 *          3.释放资源
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_01_OutputStream\\a.txt");
        int len = 0;
        /*当移动到结尾的下一位时，为-1（结束标记）*/
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }
        System.out.println(fis.read());
        System.out.println(fis.read());
        fis.close();
    }
}
