package IOAndProperties.IO_05_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/** JDK8新特性
 *  try前面可以定义流对象
 *  在try后边的(a; b; ...)中可以直接引入流对象的变量名
 *   最后流对象也会自动释放
 */
public class Demo03JDK8 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_05_trycatch\\test.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_05_trycatch\\new test.txt");
        try (fis;fos) {
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
