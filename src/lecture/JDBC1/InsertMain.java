package lecture.JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertMain {
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			// 1단계: JDBC드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1단계 드라이버 로딩 성공...");

			// 2단계: DriverManager를 이용한 DB접속, Connection 객체 얻기
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA14";
			String password = "4704";

			conn = DriverManager.getConnection(url, user, password);
			System.out.println("2단계 db 접속 성공 : " + conn);

			// 3단계: sql문 작성 (statement)
			stmt = conn.createStatement();

			String sql = "insert into t_test(id,name) values('hong','홍길동')";

			// 4단계: sql문 실행 및 결과 도출
			int cnt = stmt.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행 삽입...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 5. 접속 종료
			if (stmt != null) {
				try {
					stmt.close();
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
