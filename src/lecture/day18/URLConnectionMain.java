package lecture.day18;

import lecture.day14IO.util.FileClose;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

class AAA implements AutoCloseable {


    @Override
    public void close() throws Exception {
        System.out.println("AAA 클래스 객체의 close() 호출...");
    }
}

public class URLConnectionMain {

    public static void main(String[] args) {

//        FileOutputStream fos = null;
//        OutputStreamWriter osw = null;
//        BufferedWriter bw = null;

        try ( //try 괄호안에서는 AutoCloseable 인터페이스를 상속받은 클래스만 사용할수있다.
              //상속받은 클래스들은 따로 close 안해줘도됨
              FileOutputStream fos = new FileOutputStream("iotest/naver.html");
              OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
              BufferedWriter bw = new BufferedWriter(osw);
              AAA aaa = new AAA();
        ) {
//            fos = new FileOutputStream("iotest/naver.html");
//            osw = new OutputStreamWriter(fos, "utf-8");
//            bw = new BufferedWriter(osw);

            URL urlObj = new URL("https://www.naver.com");
//            URL urlObj = new URL("http://172.16.88.129/Lecture/");
            URLConnection uc = urlObj.openConnection();

//            System.out.println(uc.getContentType());
//            System.out.println(uc.getContentLength());

            //URL 객체의 전송정보를 iotest/naver.html에 저장
            InputStream is = uc.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            BufferedReader br = new BufferedReader(isr);

            FileClose.close(br);
            FileClose.close(isr);
            FileClose.close(is);

            while (true) {
                String data = br.readLine();
                if (data == null) break;
                bw.write(data);
                bw.newLine();
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            FileClose.close(bw);
//            FileClose.close(osw);
//            FileClose.close(fos);

        }
    }
}
