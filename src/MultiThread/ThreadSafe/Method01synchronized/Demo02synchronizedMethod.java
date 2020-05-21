package MultiThread.ThreadSafe.Method01synchronized;

/** 解决线程安全地第二种方法：
 * （1）使用同步方法
 *      格式：
 *          修饰符 synchronized 返回值类型 方法名(参数列表) {
 *              可能出现线程安全问题的代码（访问了共享数据的代码）
 *          }
 *
 *      同步方法地锁对象是谁？
 *          就是实现类对象this
 *
 *  （2）使用静态同步方法
 *      锁对象是谁？
 *          不是this，this是创建对象之后产生的，静态方法优先于对象
 *          这里锁对象是本类的class属性Demo02synchronizedMethodRunnableImp.class（反射）
 */
public class Demo02synchronizedMethod {
    public static void main(String[] args) {
        Demo02synchronizedMethodRunnableImp run = new Demo02synchronizedMethodRunnableImp();
        Thread thread01 = new Thread(run);
        Thread thread02 = new Thread(run);
        Thread thread03 = new Thread(run);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
