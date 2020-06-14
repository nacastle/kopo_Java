package lecture.day14IO.util;

import java.io.InputStream;
import java.io.OutputStream;
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
    public static void close(InputStream is) { // filereader든 bufferedReader든 reader를 상속받기 때문에 파라미터를 reader로 설정해도 무관
        if (is != null) {
            try {
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(OutputStream os) { // filereader든 bufferedReader든 reader를 상속받기 때문에 파라미터를 reader로 설정해도 무관
        if (os != null) {
            try {
                os.close();
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
