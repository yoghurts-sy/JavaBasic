package MultiThread.Demo06Lambda;

/**
 * JDK 8新特性
 *      Lambda表达式的标准格式：
 *          由三部分组成：
 *              (1)一些参数
 *              (2)一个箭头
 *              (3)一段代码
 *           格式：
 *              (参数列表) -> {一些重写的方法}
 *           ():参数列表
 *           ->:传递的意思
 *           {}:重写接口的抽象方法体
 *
 *     使用Lambda的前提：
 *          1.必须有接口（函数式接口），且接口有且只有一个抽象方法
 *          2.要简化必须可以上下文推导
 *
 *      简化Lambda：
 *          可以省略的内容：
 *              1.（参数列表）：括号中参数列表的数据类型，可以省略不写
 *              2.（参数列表）：括号中的参数如果只有一个，那么类型和（）都可以省略
 *              3.（一些代码）：如果（）中的代码只有一行无论是否有返回值{}；return这三个都可以一起省略。
 *
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() /*注意这个括号*/{
                System.out.println(Thread.currentThread().getName() + "创建了");
            }
        }).start();

        new Thread(()->{/*注意这个括号*/
            System.out.println(Thread.currentThread().getName() + "创建了");
        }).start();

        /*简化*/
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "创建了")).start();
    }
}
