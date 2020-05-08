package IOAndFile.IO_05_trycatch;

import java.io.FileWriter;
import java.io.IOException;

/** 使用
 *      try {
 *          可能出现异常的代码
 *      }catch(异常类型 异常变量) {
 *
 *      }finally {
 *          必须执行的语句
 *      }
 *
 */
public class Demo01trycatch {
    public static void main(String[] args) {
        /**
         * 提高变量的作用域，让finally可以使用
         * 变量在定义时可以没有值，但是在使用时必须有值，所以赋值null
         */
        FileWriter fw = null;
        try {
            /*fw不赋值null，如果fw创建失败，fw没有值，而下面的close语句就会异常，空指针异常*/
            fw = new FileWriter("F:\\test.txt");
            fw.write("helloworld");
        }catch (IOException e) {
            System.out.println(e);
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
