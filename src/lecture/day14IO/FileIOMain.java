package lecture.day14IO;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain {

    public static void main(String[] args) {

        System.out.println("입력하세요. 종료는 ctrl+d 입니다."); // 이클립스는 ctrl+z


        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is); // 바이트를 파라미터로 받아와서 character로 배출해주기



        try {
            while (true) {
                int c = isr.read(); // 예외처리가 필요한 메소드임 (간접 예외처리) // 종료되면 -1을 리턴함
                if (c == -1) {
                    break;
                }
                System.out.print((char)c); // a는 97 부터 쭉 // byte를 string으로 넘겨주는 메소드 if

            }
        } catch (Exception e) {
            e.printStackTrace();
        }



/*        InputStream is = System.in; //이건 바이트 스트림임

        try {
            while (true) {
                int c = is.read(); // 예외처리가 필요한 메소드임 (간접 예외처리) // 종료되면 -1을 리턴함
                if (c == -1) {
                    System.out.println();
                    break;
                }
                System.out.print((char)c); // a는 97 부터 쭉 // 안녕 이라고 입력하면 이상한 이유: 바이트 코드로 읽었기때문에(유니코드로 읽으면 잘되는데)

            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

}
