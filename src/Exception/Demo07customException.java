package Exception;

/**
 * 自定义异常类：
 *      格式：
 *          public class XXXException extends Exception / RuntimeException {
 *              1.一个无参的构造方法
 *              2.一个带异常信息参数的构造方法
 *          }
 */
public class Demo07customException extends Exception{
    public Demo07customException() {
        super();
    }
    public Demo07customException(String msg) {
        super(msg);
    }
}
