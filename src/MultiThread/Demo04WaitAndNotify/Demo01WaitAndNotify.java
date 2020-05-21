package MultiThread.Demo04WaitAndNotify;

/** 等待唤醒案例
 *      创建一个顾客线程（消费者）：告知老板包子的种类和数量，调用wait方法，放弃cpu的执行，进入到WAITING状态
 *      创建一个老板线程（生产者）：花5秒做包子，做好包子后，调用notify方法，唤醒顾客吃包子
 *   注意：
 *      顾客和老板的线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
 *      **同步使用的锁必须唯一**
 *      只有锁对象才能调用wait和notify方法，两个方法必须写在同步代码块中
 *
 *      Object类中的方法
 *      void wait()
 *          1.在其他线程调用此对象notify()方法或notifyAll()方法前，导致当前线程等待
 *          2.还可以传入毫秒，当时间到时若未被唤醒，则唤醒线程
 *     void notify()
 *          唤醒在此对象监视器上等待的单个线程，如有多个随机唤醒一个
 *          会执行wait方法之后的代码
 *     void notifyAll()
 *          唤醒在此对象监视器上等待的所有线程
 *
 *
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("告知老板包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，开吃！");
                        System.out.println("------------");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("花5秒做包子，做好包子唤醒顾客吃包子");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
