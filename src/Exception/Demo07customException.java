package Exception;

/**
 * �Զ����쳣�ࣺ
 *      ��ʽ��
 *          public class XXXException extends Exception / RuntimeException {
 *              1.һ���޲εĹ��췽��
 *              2.һ�����쳣��Ϣ�����Ĺ��췽��
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
