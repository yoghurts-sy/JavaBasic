package IOAndFile.IO_04_Writer;

import java.io.FileWriter;
import java.io.IOException;

/** ��д
 *  new FileWriter(String fileName��boolean offend);
 *  new FileWriter(File file��boolean offend);
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_04_Writer\\test3.txt", true);
        char[] cbuf = {'��', '��', '��'};
        fw.write(cbuf);
        fw.write("\r\n");
        String msg = "��Ҳ��";
        fw.write(msg);
        fw.close();
    }
}
