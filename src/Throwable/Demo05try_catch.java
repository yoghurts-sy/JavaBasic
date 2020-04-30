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
 *      }finally {
 *
 *      }
 *
 *   注意：
 *      1.如果try中产生了异常，就会执行catch中的语句，catch之后的代码也会得到执行
 *      2.如果无异常，就不会执行catch中的代码。
 *      3.finally不能单独使用，必须和try一起使用
 *      4.finally一般用于资源释放（资源的回收），无论程序是否出现异常，最后都要释放资源（IO）
 *
 *   Throwable类中3个异常处理的方法:
 *      1.String getMessage() :返回throwable的简短描述
 *      2.String toString() :返回throwable较详细的描述
 *      3.void printStockTrace() :JVM打印异常对象的默认方法，信息最全面最后输出，并中止程序
 */
public class Demo05try_catch {
    public static void main(String[] args) /*throws IOException*/ {
        try {
            readFile("c:\\a.tdt");
        } catch (IOException e) {

            System.out.println("1." + e.getMessage());
            System.out.println("2." + e.toString());
            System.out.println("3." + e);//= System.out.println(e.toString());
            e.printStackTrace();
            /*
            为什么e.printStackTrace();最后才输出？？？
             */
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
