package IOAndProperties.IO_01_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/** java.io.OutputStream:�ֽ������
 *      �˳������Ǳ�ʾ����ֽ�����������ĳ���
 *
 *  ������һЩ���๲�Եĳ�Ա������
 *      * `public void close()` ���رմ���������ͷ��������������κ�ϵͳ��Դ��
 *      * `public void flush() ` ��ˢ�´��������ǿ���κλ��������ֽڱ�д����
 *      * `public void write(byte[] b)`���� b.length�ֽڴ�ָ�����ֽ�����д����������
 *      * `public void write(byte[] b, int off, int len)` ����ָ�����ֽ�����д�� len�ֽڣ���ƫ���� off��ʼ��������������
 *      * `public abstract void write(int b)` ����ָ�����ֽ��������
 *
 *  java.io.FileOutputStream extends OutputStream
 *  FileOutputStream���ļ��ֽ������
 *      ���ã�
 *          ���ڴ������д�뵽Ӳ�̵��ļ���
 *      ���췽����
 *          FileOutputStream(String name)����һ�������ָ�����Ƶ��ļ���д�����ݵ�����ļ�����
 *          FileOutputStream(File file)����һ����ָ��File�����ʾ���ļ���д�����ݵ��ļ������
 *      ������
 *          д�����ݵ�Ŀ�ĵ�
 *          String name��Ŀ�ĵ���һ���ļ���·��
 *          File file��Ŀ�ĵ���һ���ļ�
 *      ���췽�������ã�
 *          1.����һ��FileOutputStream����
 *          2.����ݹ��췽���д��ݵ��ļ�/�ļ�·��������һ���յ��ļ�
 *          3.���FileOutputStream����ָ�򴴽��õ��ļ�
 *
 *      д�����ݵ�ԭ���ڴ�-->Ӳ�̣���
 *          java����-->jvm��java�������-->os������ϵͳ��-->os������д���ݵķ�����-->������д���ļ���
 *
 *      �ַ��������ʹ�ò��裺
 *          1.����һ��FileOutputStream���󣬹��췽���д���д���ļ���Ŀ�ĵ�
 *          2.����FileOutputStream�еķ�����������д���ļ���
 *          3.�ͷ���Դ����߳����Ч�ʣ�
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException /*Alt + enter */ {
        //�ᴴ��һ���յ��ļ�
        FileOutputStream fos = new FileOutputStream("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\OutputStream\\a.txt");
        fos.write(97);
        fos.close();
        /** д���ݵ�ʱ����10���Ƶ�����97ת��λ����������97
         *  fos.write(1100001):97-->1100001
         *  ��Ϊʲô���ǵõ�97��
         *      ������ı��༭�������±���notepad++...��
         *      �ڴ��ļ���ʱ�򣬶����ѯ��������ֽ�ת��λ�ַ�
         *      ����ǣ�
         *          0~127����ѯASC���97-->a��
         *          ��������ѯϵͳĬ�����������ϵͳGBK��
         */
    }
}
