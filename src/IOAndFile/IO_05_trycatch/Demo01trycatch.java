package IOAndFile.IO_05_trycatch;

import java.io.FileWriter;
import java.io.IOException;

/** ʹ��
 *      try {
 *          ���ܳ����쳣�Ĵ���
 *      }catch(�쳣���� �쳣����) {
 *
 *      }finally {
 *          ����ִ�е����
 *      }
 *
 */
public class Demo01trycatch {
    public static void main(String[] args) {
        /**
         * ��߱�������������finally����ʹ��
         * �����ڶ���ʱ����û��ֵ��������ʹ��ʱ������ֵ�����Ը�ֵnull
         */
        FileWriter fw = null;
        try {
            /*fw����ֵnull�����fw����ʧ�ܣ�fwû��ֵ���������close���ͻ��쳣����ָ���쳣*/
            fw = new FileWriter("F:\\test.txt");
            fw.write("helloworld");
        }catch (IOException e) {
            System.out.println(e);
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
