package Exception;

import java.util.List;

/**
 * 子父类的异常
 */
public class Demo06extends {
    public void show01() throws NullPointerException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws NullPointerException{}
    public void show04() {}
}
class son extends Demo06extends {
    //子类重写父类方法抛出和父类一样的异常
    @Override
    public void show01() throws NullPointerException {
    }
    //子类重写父类异常时，可以抛出父类异常的子类
    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {
    }
    //子类重写父类可以不抛出异常
    @Override
    public void show03() {
    }
    //父类不抛出异常时，子类只能捕获异常
    @Override
    public void show04() {
        try {
            List<Integer> integers = List.of(1, 2, 3);
            System.out.println(integers.get(3));
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
