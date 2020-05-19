package lecture.day14IO;

import lecture.util.FileClose;

import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain04 {

    // iotest/FileIOMain02.java --> iotest/FileIOMain02.java.txt 복사

    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("iotest/FileIOMain02.java");
            fw = new FileWriter("iotest/FileIOMain02.java.txt");

            while (true) {
                int c = fr.read(); // 문자단위로 2바이트씩 읽어옴
                if (c==-1) {
                    break;
                }
                fw.write(c);
//                System.out.print((char) c);
            }
            System.out.println("복사완료");
            fw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            FileClose.close(fr);
            FileClose.close(fw);
/*

            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
*/
        }
    }

}
