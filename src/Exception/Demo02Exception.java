package Exception;

/**
 * 异常产生的原理：
 *      第一步：JVM检测出程序会出现异常
 *            1.JVM会根据异常产生的原因创建一个异常对象，这个异常对象包含异常产生的（内容，原因，位置）
 *                  new ArrayIndexOutOfBoundsException("3");
 *            2.在getElement方法中，没有异常的处理逻辑（try...catch）
 *            那么JVM就会将这个异常对象抛出给方法的调用者main方法
 *      第二步：main方法接受到这个异常对象，但是main方法里也没有异常处理逻辑
 *            继续把这个异常对象抛出给main方法的调用者JVM处理
 *      第三步：JVM接受到后
 *            1.把异常对象的（内容，原因，位置）以红色字体打印在控制台
 *            2.JVM终止当前正在进行Java程序，即中断处理
 *
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(getElement(arr, 3));
    }
    public static int getElement(int[] arr, int index){
        return arr[index];
    }
}
