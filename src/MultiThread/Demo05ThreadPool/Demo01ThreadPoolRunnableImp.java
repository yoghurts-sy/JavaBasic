package MultiThread.Demo05ThreadPool;

public class Demo01ThreadPoolRunnableImp implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "����һ���µ��߳�");
    }
}
