package lecture.day18;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class AppClientMain {
    public static void main(String[] args) {

        try {
            System.out.println("서버와의 접속을 시도합니다..");
            Socket socket = new Socket("localhost", 10001); // localhost(127.0.0.1): 자신의 컴퓨터 // 서버 포트:12121

            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            String msg = dis.readUTF();

            System.out.println("서버에서 전송된 메세지 : " + msg);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
