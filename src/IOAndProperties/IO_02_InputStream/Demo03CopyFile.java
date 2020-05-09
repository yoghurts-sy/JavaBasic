package IOAndProperties.IO_02_InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** �����ļ���ϰ��
 *      һ��һд
 *
 *     �ļ����ƵĲ��裺
 *          1.����һ���ֽ����������󣬹��췽���а�Ҫ��ȡ������
 *          2.����һ���ֽ���������󣬹��췽����Ҫ��д���Ŀ�ĵ�(�ǵü��ļ���)
 *          3.ʹ���ֽ���������read����
 *          4.ʹ���ֽ��������write����
 *          5.�ͷ���Դ
 */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\yoghurt.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_02_InputStream\\yoghurt.jpg");

        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println("����ʱ�䣺" + (end - start) + "����");
    }
}
