package IOAndFile.IO_04_Writer;

import java.io.FileWriter;
import java.io.IOException;

/** 字符输出流写数据
 *      `void write(char[] cbuf) `写入字符数组。
 *      `abstract  void write(char[] cbuf, int off, int len) `写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
 *      `void write(String str) `写入字符串。
 *      `void write(String str, int off, int len)` 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 *
 *
 */
public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_04_Writer\\test2.txt");
        /*
        char[] cbuf = {'1', '2', '3', '4'};
        fw.write(cbuf, 0, 4);
        */
        String sbuf = "你好啊！";
        fw.write(sbuf, 0, sbuf.length());

        fw.close();
    }
}
