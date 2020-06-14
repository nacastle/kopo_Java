package lecture.day14IO;

import java.io.*;

public class FileIOMain03 {

    public static void write() {

        FileOutputStream fos = null;
        DataOutputStream dos = null;

        try {
            fos = new FileOutputStream("iotest\\data_writer2.txt"); // 1바이트씩 읽어옴
            dos = new DataOutputStream(fos); // 이거 없으면 1바이트로만 읽음

            char c = 'A';
//            fos.write(c);
            dos.writeChar(c); // char는 2바이트씩이라서 앞에 띄어쓰기 하고 A 출력
            dos.writeInt(123); // Int는 4바이트씩이라서 앞에 띄어쓰기 2번하고 } 출력 // 아스키코드 123은 }
            dos.writeDouble(123.2123);
            System.out.println("저장완료...");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void read() throws Exception{ // 좀 펀하게 진행하려고 예외처리 던져줌
        FileInputStream fis = new FileInputStream("iotest\\data_writer.txt");
        DataInputStream dis = new DataInputStream(fis);

        char c = dis.readChar();
        int num = dis.readInt();
        double num2 = dis.readDouble(); // 순서가 틀리면 안됨

        System.out.println("읽어온 문자: " + c); // 문자: 2바이트
        System.out.println("읽어온 정수: " + num); // 정수: 4바이트
        System.out.println("읽어온 정수: " + num2); // 실수: 8바이트

        dis.close();
        fis.close();
    }

    public static void main(String[] args) {
        write();
        try {
            read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
