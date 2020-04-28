package Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang.Throwable 是Java语言中所有错误或异常的超类
 *      Exception:编译器异常，进行编译（写代码）Java程序时出现的异常
 *          RuntimeException：运行期异常
 *      Error：错误
 *          必须修改源代码，才可以继续执行
 */
public class Demo01Exception {
    public static void main(String[] args)/* throws ParseException*/ {
        /* 1.编译期异常
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse("1999-11-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
         */

        /* 2.运行期异常
        int[] arr = {1, 2, 3};
        try {
            //可能会出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
        */

        /*3. Error错误 必须修改代码*/
        int[] arr = new int[1024*1024*1024];
        System.out.println("后续代码");

    }
}
