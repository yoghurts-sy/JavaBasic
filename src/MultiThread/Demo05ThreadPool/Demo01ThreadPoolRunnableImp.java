package MultiThread.Demo05ThreadPool;

public class Demo01ThreadPoolRunnableImp implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建一个新的线程");
    }
}
