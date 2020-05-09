package IOAndProperties.IO_01_OutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**  写入字节的方法:
 *   `public void write(byte[] b)`：将 b.length字节从指定的字节数组写入此输出流。
 *   `public void write(byte[] b, int off, int len)` ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
 *
 */
public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\OutputStream\\b.txt"));
        /**
         * 面试题：在文件中显示100是3个字节
         * `public void write(byte[] b)`
         *  如果写的第一个字节是正数（0~127），那么显示的时候就会查询ASCⅡ表
         *  如果写的第一个字节是负数，那第一个字节化为会和第二个字节组成中文显示查询GBK(两个字节是中文)
         */
        byte[] bytes = {-65, 66, -67, 68, 69};
        fos.write(bytes);
        /**
         * `public void write(byte[] b, int off, int len)`
         * off:从哪开始
         * len：写几个字节
         */
        fos.write(bytes, 1, 2);

        byte[] bytes2 = "520五塘".getBytes();
        fos.write(bytes2);
        fos.close();
    }
}
