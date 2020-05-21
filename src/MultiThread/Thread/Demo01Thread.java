package MultiThread.Thread;

/** 创建多线程的第一种方法：创建Thread类的子类
 *      java.lang.Thread类：是描述线程的类，我们想要实现多线程的程序，就必须继承Thread类
 *
 *      实现步骤：
 *          1.创建一个Thread的子类
 *          2.在Thread类的子类中重写run方法，设置线程任务（即开启线程要做什么？）
 *          3.创建Thread类子类的对象
 *          4.调用Thread类中的start方法，开启新的线程，执行run方法
 *              void start()使该线程开始执行。Java虚拟机调用该线程的run方法
 *              结果是两个线程并发地运行，当前线程（main线程）和另一个线程（创建地新线程）
 *              多次启动一个线程是非法的，特别是当前线程已经结束执行后，不能再次启动
 *
 *          java程序属于抢占式调度，哪一个线程的优先级高，就优先执行。如果同优先级，随机选择一个执行。
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Demo01myThread demo01myThread = new Demo01myThread();
        demo01myThread.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("Main->" + i);
        }
    }
}
