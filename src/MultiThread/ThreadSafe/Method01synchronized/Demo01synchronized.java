package MultiThread.ThreadSafe.Method01synchronized;

/** 卖票案例
 *
 *      解决线程安全问题的一种方法：使用同步代码块
 *      格式：
 *          synchronized(锁对象) {
 *              可能出现线程安全问题的代码（访问了共享数据的代码）
 *          }
 *
 *       注意：
 *          1.同步代码块中的锁对象，可以使用任意的对象
 *          2.但是必须保证多个线程使用的对象是同一个锁
 *          3.锁对象的作用：
 *              把同步代码块锁住，只让一个线程在同步代码块中执行
 *
 *       原理：
 *          线程1先会检查synchronized中是否有锁
 *              如果有，则获取锁对象，进入到同步中执行
 *              如果没有，则会进入阻塞状态，一直等待拿了锁的线程归还锁
 *
 *       即：同步中的线程，没有执行完毕不会释放锁，同步外的线程没有锁进不去同步
 *
 *       缺点：程序会频繁地判断锁、获取锁、释放锁，程序地效率就会降低
 *
 */
public class Demo01synchronized {
    public static void main(String[] args) {
        Demo01synchronizedRunnableImp run = new Demo01synchronizedRunnableImp();
        Thread thread01 = new Thread(run);
        Thread thread02 = new Thread(run);
        Thread thread03 = new Thread(run);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
