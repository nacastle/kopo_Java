package homework.day17.EchoServer;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {

    private Socket client;

    public EchoThread(Socket client) {
        this.client = client; // 만들어준 소켓 잃어버리면 안되니까... 멤버변수 소켓 만들어주고 생성자에 소켓 기억시켜주고

    }

    @Override
    public void run() {
        InetAddress clientIpAdress = client.getInetAddress();
        System.out.println("[" + clientIpAdress + "] 님이 접속하였습니다.");

        try (
                InputStream is = client.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                OutputStream os = client.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                PrintWriter pw = new PrintWriter(osw);
        ) {
            while (true) {
                String msg = br.readLine();
                if (msg == null) {
                    System.out.println("[" + clientIpAdress + "]님과의 접속이 종료되었습니다.");
                    client.close();
                    break;
                }
                System.out.println("[" + clientIpAdress + "]님이 보낸 메세지 : " + msg);

                pw.println(msg);
                pw.flush();
            }


        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}

public class EchoThreadServerMain {

    public static void main(String[] args) {

        System.out.println("EchoServer를 구동하겠습니다...");
        try {
            ServerSocket server = new ServerSocket(10001);

            while (true) {
                Socket client = server.accept();
                System.out.println(client);

                EchoThread et = new EchoThread(client);
                et.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
