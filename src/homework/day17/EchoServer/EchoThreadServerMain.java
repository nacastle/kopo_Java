package homework.day17.EchoServer;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoThreadServerMain {

    public static void main(String[] args) {

        System.out.println("EchoServer를 구동하겠습니다...");
        try {
            ServerSocket server = new ServerSocket(10001); // 서버 소켓 생성 (ip + 포트)

            while (true) { // 여러 클라이언트가 서버에 접속할 수 있도록 서버를 무제한 구동시키기
                Socket client = server.accept(); // 클라이언트로부터 연결 요청이 들어오면 연결을 맺고 클라이언트 소켓을 생성해 리턴
                System.out.println("클라이언트 소켓 정보" + client);

                EchoThread et = new EchoThread(client);
                et.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
