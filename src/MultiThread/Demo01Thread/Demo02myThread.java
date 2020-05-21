package MultiThread.Demo01Thread;

public class Demo02myThread extends Thread{
    public Demo02myThread() {
    }
    public Demo02myThread(String Name) {
        super(Name);
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
