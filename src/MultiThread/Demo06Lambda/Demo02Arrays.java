package MultiThread.Demo06Lambda;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo02Arrays {
    public static void main(String[] args) {
        Demo02Person[] arr = {
                new Demo02Person("小王",10),
                new Demo02Person("小李",19),
                new Demo02Person("小张",20),
        };

        Arrays.sort(arr, (Demo02Person o1, Demo02Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        /*简化*/
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        for (Demo02Person p : arr) {
            System.out.println(p);
        }
    }
}
