package lecture.JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {
	public static void main(String[] args) {

        //1단계 : JDBC 드라이버 로딩

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공...");
            
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.88.120:1521:dink", "DA14", "4704"); // 내 컴퓨터에 오라클db가 깔려있으면 localhost라고 함
            
            System.out.println("db 접속 성공 : " + conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
