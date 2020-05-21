package lecture.JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2단계
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA14";
			String password = "4704";

			conn = DriverManager.getConnection(url, user, password);

			// 3단계 (PreparedStatement)
			System.out.print("등록할 아이디를 입력하세요 : ");
			String id = sc.nextLine();

			System.out.print("등록할 이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			String sql = "insert into t_test(id,name)" +
						 " values(?,?)"; // 아직 미정인부분 ?로 대체 가능
			
			ps = conn.prepareStatement(sql); // 문자형은 ' 넣어줘야하는데  ps는 알아서 넣어줌
			ps.setString(1,id); // 작은 따옴표 알아서 들어감
			ps.setString(2,name);
					
		
			// 4단계 sql 실행 및 결과 도출
			int cnt = ps.executeUpdate();
			System.out.println("총" + cnt+"개 행 삽입");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		
	}

}
