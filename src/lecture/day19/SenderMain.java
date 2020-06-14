package lecture.day19;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class SenderMain {

    public static void main(String[] args) {
        //UDP방식으로 데이터 전달
        try {
            DatagramSocket socket = new DatagramSocket();

            System.out.println("[송신 시작]");

            for (int i = 1; i <= 3; i++) {
                String msg = "메세지-" + i;

//                DatagramPacket packet = new DatagramPacket(new );
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
