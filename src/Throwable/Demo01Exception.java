package Throwable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang.Throwable ��Java���������д�����쳣�ĳ���
 *      Exception:�������쳣�����б��루д���룩Java����ʱ���ֵ��쳣
 *          RuntimeException���������쳣
 *      Error������
 *          �����޸�Դ���룬�ſ��Լ���ִ��
 */
public class Demo01Exception {
    public static void main(String[] args)/* throws ParseException*/ {
        /* 1.�������쳣
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = simpleDateFormat.parse("1999-11-01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
         */

        /* 2.�������쳣
        int[] arr = {1, 2, 3};
        try {
            //���ܻ�����쳣�Ĵ���
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
        */

        /*3. Error���� �����޸Ĵ���*/
        int[] arr = new int[1024*1024*1024];
        System.out.println("��������");

    }
}
