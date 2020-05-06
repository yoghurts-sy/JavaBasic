package IOAndFile.IO_03_Reader;

import java.io.FileReader;
import java.io.IOException;

/** 字符输入流：Reader
 *      当使用字节流读取文本文件时，可能会有一个小问题。就是遇到中文字符时，
 *      可能不会显示完整的字符，那是因为一个中文字符可能占用多个字节存储。
 *      所以Java提供一些字符流类，以字符为单位读写数据，专门用于处理文本文件。
 *
 *  `java.io.Reader`抽象类是表示用于读取字符流的所有类的超类，可以读取字符信息到内存中。
 *   它定义了字符输入流的基本共性功能方法：
 *      `public void close()` ：关闭此流并释放与此流相关联的任何系统资源。
 *      `public int read()`： 从输入流读取一个字符。
 *      `public int read(char[] cbuf)`： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中
 *
 *  FileReader：文件字符输入流
 *         作用：把硬盘文件中的数据以字符的方式读到内存中
 *         构造方法：
 *               FileReader(String filename):String filename:文件路径
 *               FileReader(File file)：File file：一个文件
 *               构造方法的作用：
 *                  1.创建一个FileReader对象
 *                  2.会把FileReader对象指向要读的文件
 */
public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_03_Reader\\test.txt");

        char[] cbuffer = new char[1024];
        int len = 0;
        while ((len = fr.read(cbuffer)) != -1){
            System.out.print(new String(cbuffer, 0, len));
        }

        fr.close();
    }
}
