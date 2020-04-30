package Throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

/** try...catch是异常处理的第二种方法
 *  格式：
 *      try {
 *          可能产生异常的代码
 *      }catch() {
 *          异常对象的处理，一般会将异常信息记录到一个日志中
 *      }
 *      ...
 *      catch() {可以接多个catch
 *
 *      }
 *   注意：
 *      1.如果try中产生了异常，就会执行catch中的语句，catch之后的代码也会得到执行
 *      2.如果无异常，就不会执行catch中的代码。
 */
public class Demo05try_catch {
    public static void main(String[] args) /*throws IOException*/ {
        try {
            readFile("c:\\a.tdt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("后续代码1");
        }
        System.out.println("后续代码2");

    }
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
