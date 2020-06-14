package lecture.day18;

import java.net.InetAddress;

public class InetAddressMain {

    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();

            System.out.println("내 컴퓨터의 네트워크 이름 : " + localHost.getHostName());
            System.out.println("내 컴퓨터의 ip 정보 : " + localHost.getHostAddress());

            InetAddress addr = InetAddress.getByName("www.naver.com");
            System.out.println("폴리텍 IP 정보 : " + addr); // 아이피 주소로 접근 가능

            InetAddress[] addrs = InetAddress.getAllByName("www.naver.com");

            System.out.println("---------------------------------------");
            System.out.println("\t네이버 ip 정보");
            System.out.println("---------------------------------------");
            for (InetAddress i : addrs) {
                System.out.println(i);
            }
            System.out.println("---------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
