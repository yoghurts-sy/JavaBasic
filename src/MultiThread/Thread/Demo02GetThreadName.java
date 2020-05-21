package MultiThread.Thread;

/** 获取线程的名称：
 *      1.使用Thread类中的方法getName()
 *          String getName()返回该线程的名称
 *      2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程的名称
 *
 *  设置线程名称：
 *      1.使用Thread类中的方法setName()
 *      2.在继承Thread类的子类中创建一个带参数的构造方法，参数传递线程的名称，
 *          在调用父类带参数的构造方法，把线程名称传递给父类
 */
public class Demo02GetThreadName {
    public static void main(String[] args) {
        Demo02myThread demo02myThread = new Demo02myThread();
        demo02myThread.setName("小红");
        demo02myThread.start();

        new Demo02myThread("小王").start();
        System.out.println(Thread.currentThread().getName());
    }
}
