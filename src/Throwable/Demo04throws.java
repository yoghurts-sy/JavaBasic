package Throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

/** throws关键字:异常处理的第一种方法，交给别人处理
 *      注意：1.throws关键字必须写在方法声明处
 *           2.throws关键字后面跟的声明必须是Exception或者是Exception的子类
 *           3.方法需要抛出多个异常时，throws必须跟多个异常
 *              当这些异常包含子父类关系时，写父类即可
 *           4.当调用了一个声明抛出异常的方法时，我们就必须对它进行处理
 *              要么继续使用throws关键字抛出，交给方法的调用者处理，最终交给JVM处理
 *              要么使用try...catch处理
 */
public class Demo04throws {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tdt");
    }
    //public static void readFile(String FileName) throws FileNotFoundException,IOException {
    public static void readFile(String FileName) throws IOException {
        /*抛出的异常有先后的次序*/
        if (!FileName.endsWith(".txt")){
            throw new IOException("文件后缀名不对");
        }

        if (!FileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递文件路径不是c:\\a.txt");
        }
    }
}
