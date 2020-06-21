package homework.day17.EchoServer2.EchoServer;

// 아직 다 구현하지 못했습니다.. 좀 더 공부해서 다음주 내로 꼭 제출하도록 하겠습니다!

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClientSocketsVO {

    private Socket clientSocket;
    private ArrayList<Socket> socketList = new ArrayList<>();

    private Map<InetAddress,PrintWriter> printWriterList = new HashMap<>();

    public Socket getClientSocket() {
        return clientSocket;
    }

    public List<Socket> getSocketList() {
        return socketList;
    }

    public Map<InetAddress, PrintWriter> getPrintWriterList() {
        return printWriterList;
    }
}
