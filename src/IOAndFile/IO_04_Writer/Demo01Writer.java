package IOAndFile.IO_04_Writer;

/** 字符输出流：Writer
 *  `java.io.Writer ：
 *  `抽象类是表示用于写出字符流的所有类的超类，将指定的字符信息写出到目的地。
 *  它定义了字节输出流的基本共性功能方法：
 *      `void write(int c)` 写入单个字符。
 *      `void write(char[] cbuf) `写入字符数组。
 *      `abstract  void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *      `void write(String str) `写入字符串。
 *      `void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 *      `void flush() `刷新该流的缓冲。
 *      `void close()` 关闭此流，但要先刷新它。
 *
 *  FileWriter：文件字符输出流
 *  作用：把内存中的字符数据写入到文件中去
 *  构造方法：
 *      FileWriter(File file):File file是一个文件
 *      FileWriter(String fileName):String fileName文件路径
 *      构造方法的作用：
 *          1.创建一个FileWriter对象
 *          2.会根据构造方法中传递的文件/文件的路径，创建文件
 *          3.会把FileWriter对象指向创建好的文件
 *
 */
public class Demo01Writer {
}
