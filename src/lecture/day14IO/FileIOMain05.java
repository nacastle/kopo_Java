package lecture.day14IO;

import lecture.util.FileClose;

import java.io.*;

public class FileIOMain05 {

    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        PrintWriter pw = null;

        try {
            fr = new FileReader("iotest\\FileIOMain02.java");
            fw = new FileWriter("iotest\\FileIOMain02-1.java.txt");

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            pw = new PrintWriter(fw); // println을 사용해주기 위해

            while (true) {
                String str = br.readLine(); // 엔터는 제외하고 입력 (엔터는 저장안함) 그래서 한줄에 다 나옴
                if (str == null) {
                    break;
                }
                System.out.println(str);

                pw.println(str);

//                bw.write(str);
//                bw.newLine();

//                bw.write("\n");
//                bw.write(str);
            }
            pw.flush();
//            bw.flush();

            System.out.println("복사완료");


        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            FileClose.close(fr,fw);
            FileClose.close(br,bw);


//            FileClose.close(fr);
//            FileClose.close(fw);
//            FileClose.close(br);
//            FileClose.close(bw);
        }
    }
}
