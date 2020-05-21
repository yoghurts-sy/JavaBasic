package MultiThread.Demo03ThreadSafe.Method02Lock;

/** 解决线程的第三种方法：使用Lock锁
 *      java.util.concurrent.Locks.Lock接口
 *      Lock接口中的方法：
 *          void lock():获取锁
 *          void unlock():释放锁
 *
 *      使用步骤：
 *          1.在成员位置创建一个ReentrantLock对象
 *          2.在可能会出现安全问题的代码前调用Lock接口中的lock方法获取锁
 *          3.在可能会出现安全问题的代码后调用Lock接口中的lock方法释放锁
 *
 */
public class Demo01Lock {
    public static void main(String[] args) {
        Demo01LockRunnableImp run = new Demo01LockRunnableImp();
        Thread thread01 = new Thread(run);
        Thread thread02 = new Thread(run);
        Thread thread03 = new Thread(run);
        thread01.start();
        thread02.start();
        thread03.start();
    }
}
