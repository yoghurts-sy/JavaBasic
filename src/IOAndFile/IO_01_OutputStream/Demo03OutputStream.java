package IOAndFile.IO_01_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**  续写:使用两个参数的构造方法
 *      `public FileOutputStream(File file, boolean append)`： 创建文件输出流以写入由指定的 File对象表示的文件。
 *      `public FileOutputStream(String name, boolean append)`： 创建文件输出流以指定的名称写入文件。
 *   参数：
 *      String name，File file：写入数据的目的地
 *      boolean append:追加写的开关
 *          true：追加写
 *          false：创建一个新文件，覆盖源文件
 *
 *   写换行：
 *      window：\r\n
 *      Linux:/n
 *      mac:\r
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\OutputStream\\c.txt", true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
        }
        fos.close();
    }
}
