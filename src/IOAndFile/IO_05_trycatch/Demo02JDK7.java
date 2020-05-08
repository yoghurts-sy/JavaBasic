package IOAndFile.IO_05_trycatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** JDK7新特性：
 *      try后面可以跟一个()，在括号中可以定义对象
 *      那么这个对象就在try中有效，try代码执行完毕，会自动释放流对象
 */
public class Demo02JDK7 {
    public static void main(String[] args) {
       try( FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_05_trycatch\\test.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_05_trycatch\\new test.txt");){
           int len = 0;
           while ((len = fis.read()) != -1) {
               fos.write(len);
           }
       }catch (IOException e) {
           System.out.println(e);
       }
    }
}
