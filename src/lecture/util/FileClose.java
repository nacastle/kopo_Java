package lecture.util;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

    public static void close(Reader r) { // filereader든 bufferedReader든 reader를 상속받기 때문에 파라미터를 reader로 설정해도 무관
        if (r != null) {
            try {
                r.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Writer w) { // fileWriter든 bufferedWriter든 writer를 상속받기 때문에 파라미터를 writer로 설정해도 무관
        if (w != null) {
            try {
                w.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Reader br, Reader r) {
        close(br);
        close(r);
    }

    public static void close(Writer bw, Writer w) {
        close(bw);
        close(w);
    }

    public static void close(Reader r, Writer w) {
        close(r);
        close(w);
    }

}
