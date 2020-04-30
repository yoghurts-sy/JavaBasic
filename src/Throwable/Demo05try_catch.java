package Throwable;

import java.io.FileNotFoundException;
import java.io.IOException;

/** try...catch���쳣����ĵڶ��ַ���
 *  ��ʽ��
 *      try {
 *          ���ܲ����쳣�Ĵ���
 *      }catch() {
 *          �쳣����Ĵ���һ��Ὣ�쳣��Ϣ��¼��һ����־��
 *      }
 *      ...
 *      catch() {���ԽӶ��catch
 *      }finally {
 *
 *      }
 *
 *   ע�⣺
 *      1.���try�в������쳣���ͻ�ִ��catch�е���䣬catch֮��Ĵ���Ҳ��õ�ִ��
 *      2.������쳣���Ͳ���ִ��catch�еĴ��롣
 *      3.finally���ܵ���ʹ�ã������tryһ��ʹ��
 *      4.finallyһ��������Դ�ͷţ���Դ�Ļ��գ������۳����Ƿ�����쳣�����Ҫ�ͷ���Դ��IO��
 *
 *   Throwable����3���쳣����ķ���:
 *      1.String getMessage() :����throwable�ļ������
 *      2.String toString() :����throwable����ϸ������
 *      3.void printStockTrace() :JVM��ӡ�쳣�����Ĭ�Ϸ�������Ϣ��ȫ��������������ֹ����
 */
public class Demo05try_catch {
    public static void main(String[] args) /*throws IOException*/ {
        try {
            readFile("c:\\a.tdt");
        } catch (IOException e) {

            System.out.println("1." + e.getMessage());
            System.out.println("2." + e.toString());
            System.out.println("3." + e);//= System.out.println(e.toString());
            e.printStackTrace();
            /*
            Ϊʲôe.printStackTrace();�������������
             */
        } finally {
            System.out.println("��������1");
        }
        System.out.println("��������2");

    }
    public static void readFile(String FileName) throws IOException {
        /*�׳����쳣���Ⱥ�Ĵ���*/
        if (!FileName.endsWith(".txt")){
            throw new IOException("�ļ���׺������");
        }

        if (!FileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("�����ļ�·������c:\\a.txt");
        }
    }
}
