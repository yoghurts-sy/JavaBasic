package MultiThread.Demo05ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 线程池：JDK1.5之后提供的
 *  java.util.concurrent.Executors：线程池的工厂类，用来生产线程池
 *  Executors类中的静态方法：
 *      static ExecutorService newFixedThreadPool(int nThreads)
 *           创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线程。
 *      参数：
 *          int nThreads：创建线程池中包含的线程数量
 *      返回值：
 *          ExecutorService接口，返回的是ExecutorService接口的实现类对象
 *          我们可以使用ExecutorService接口来接收（面向接口编程）
 *
 *   java.util.concurrent.ExecutorService：线程池接口
 *      用来从获取线程池中获取线程，调用start方法：执行线程任务
 *             submit(Runnable task) 提交一个 Runnable 任务用于执行
 *             shutdown()：关闭线程池，不建议使用
 *
 *  使用步骤：
 *     1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定数量的线程池
 *     2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
 *     3.调用 ExecutorService接口中submit方法，传递线程任务，开启线程
 *
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
        executorService.submit(new Demo01ThreadPoolRunnableImp());
    }
}
