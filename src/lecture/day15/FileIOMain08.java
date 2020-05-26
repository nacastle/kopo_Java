package lecture.day15;

import lecture.day14IO.util.FileClose;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIOMain08 {
    public static void write() {
        UserInfo user = new UserInfo("홍길동", 25, "광명시");

        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter("iotest/userInfo.txt");
            bw = new BufferedWriter(fw);

            bw.write(user.getName()+":"+user.getAge()+":"+user.getAddr());
            bw.newLine();
            bw.flush();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            FileClose.close(bw,fw);
        }

    }

    public static void read() {

        UserInfo user = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("iotest/userInfo.txt");
            br = new BufferedReader(fr);

            String data = br.readLine();
            System.out.println(data);
            String[] dataArr = data.split(":");

            String name = dataArr[0];
            int age = Integer.parseInt(dataArr[1]);
            String addr = dataArr[2];
            user = new UserInfo(name, age, addr);

            System.out.println("userInfo.txt 로드 완료");
            System.out.println(user);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            FileClose.close(br,fr);
        }

    }

    public static void main(String[] args) {
        write();
        read();
    }
}
