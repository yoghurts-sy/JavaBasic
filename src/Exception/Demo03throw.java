package Exception;

import java.util.Objects;

/** 抛出异常：throw关键字
 *      作用：可以使用throw关键字在指定方法中抛出指定异常
 *      格式：throw new xxxException（"异常产生的原因"）
 *      注意：1.throw关键字必须写在方法的内部
 *           2.throw关键字new的对象必须是Exception或者Exception的子类对象
 *           3.throw抛出的异常，我们必须对它进行处理
 *              （1）如果throw关键字后边的创建的是RuntimeException或者是RuntimeException的子类，我们可以不处理，而交给JVM处理(打印异常对象，中断程序)
 *               (2)如果是编译异常，则throws 或try...catch
 */
public class Demo03throw {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //System.out.println(getElement(arr, 3));
        method(null);
    }
    public static int getElement(int[] arr, int index){
        if (arr == null) {
            throw new NullPointerException("传递的数组值为null");
        }
        if (index < 0 || index > arr.length - 1){
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }
        return arr[index];
    }

    public static void method(Object obj){
        //Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的值为null");
    }
}
