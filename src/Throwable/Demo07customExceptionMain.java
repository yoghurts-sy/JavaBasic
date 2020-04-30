package Throwable;

import java.util.Scanner;

/*
Demo要求：我们模拟注册操作，如果用户名已经存在，则抛出异常提示：亲，该用户名已经被注册了
        *
        *      分析：
        *          1.使用数组保存已经注册过的用户名
        *          2.Scanner接受
        *          3.定义一个方法对是否重名判断
        *              true：
        *                  抛出customException
        *              false：
        *                  继续遍历比较
        *           跳出循环"恭喜您，注册成功"
 */
public class Demo07customExceptionMain {
    private static String[] usernames = {"张三", "李四", "王五"};
    private static void checkUsernames(){
        String name = getInput();
        for (String username : usernames) {
            if (username.equals(name)) {
                try {
                    throw new Demo07customException("亲，该用户名已经被注册了!");
                } catch (Demo07customException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜您，注册成功");
    }
    private static String getInput(){
        System.out.println("请输入您要注册的用户名:");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        checkUsernames();
    }
}
