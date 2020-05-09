package IOAndProperties.IO_02_InputStream;

import java.io.FileInputStream;
import java.io.IOException;

/** 字节输入流一次读取多个字节的方法
 *      `public int read(byte[] b)`：
 *          从输入流中读取一定数量的字节，并将其存储在缓冲区数组b中
 *       明确两件事情：
 *          1.方法的参数byte[]的作用？
 *              起到缓存的作用，存储每次读取到的多个字节
 *              数组的长度一般记为1024（1KB）或者时1024的整数倍
 *          2.方法的返回值int是什么？
 *              每次读取的有效字节个数
 *
 *  String类的构造方法：
 *      String(byte[] bytes):把字符数组转换为字符串
 *      String(byte[] bytes, int offset, int length):把字符数组一部分转换为字符串(offset开始索引，length转换的字节个数)
 *
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        /*a.txt  abcd*/
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_01_OutputStream\\a.txt");
       /*
        原理：
                 bytes[0] bytes[1]  len读取的有效字节个数
        第一次读取    A        B             2
        第二次读取    C        D             2
        第三次读取    E                      1
        第四次读取                          -1

            最后     E        D
        */
        /*
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

        len = fis.read(bytes);
        System.out.println(len);
        System.out.println(new String(bytes));

         */

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
    }
}
