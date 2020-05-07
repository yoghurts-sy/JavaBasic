package IOAndFile.IO_04_Writer;

import java.io.FileWriter;
import java.io.IOException;

/** 续写
 *  new FileWriter(String fileName，boolean offend);
 *  new FileWriter(File file，boolean offend);
 */
public class Demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\yoghurts\\IDEA_WorkSpace\\com.java.basic\\src\\IOAndFile\\IO_04_Writer\\test3.txt", true);
        char[] cbuf = {'你', '好', '啊'};
        fw.write(cbuf);
        fw.write("\r\n");
        String msg = "你也是";
        fw.write(msg);
        fw.close();
    }
}
