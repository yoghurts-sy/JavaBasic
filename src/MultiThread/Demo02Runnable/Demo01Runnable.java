package MultiThread.Demo02Runnable;

/** 创建多线程的第二种方法：实现Runnable接口
 *      java.lang.Runnable：
 *          Runnable接口应该由那些打算通过某一线程执行其实例的类来实现
 *          类必须实现一个run的无参方法。
 *       java.lang.Thread类的构造方法
 *          Thread(Runnable target)分配新的Thread对象
 *          Thread(Runnable target, String Name)分配新的Thread对象
 *
 *       实现步骤：
 *          1.创建新的Runnable接口的实现类
 *          2.在实现类中重写run方法，设置线程任务
 *          3.创建一个Runnable接口的实现类对象
 *          4.创建Thread类对象，构造方法中传入Runnable接口的实现类对象
 *          5.调用Thread类中的start方法
 *
 *     实现Runnable的好处：
 *          1.避免了单继承的局限性
 *              一个类只能继承一个类，类继承了Thread类就不能继承其他类
 *              实现Runnable接口，还可以继承其他的类，实现其他的接口
 *          2.增强了程序的扩展性，降低了程序的耦合性（解耦）
 *              实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离（解耦）
 *              实现类中，重写了run方法，用来设置线程任务
 *              创建Thread类对象，调用start方法，开启新的线程
 *
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }

        Demo01RunnableImp demo01RunnableImp = new Demo01RunnableImp();
        Thread thread = new Thread(demo01RunnableImp);
        thread.start();
    }
}
