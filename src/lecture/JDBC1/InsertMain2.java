package lecture.JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		Statement st = null;

		try {
			// 1단계
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2단계
			String url = "jdbc:oracle:thin:@172.16.88.120:1521:dink";
			String user = "DA14";
			String password = "4704";

			conn = DriverManager.getConnection(url, user, password);

			// 3단계
			st = conn.createStatement();

			System.out.print("등록할 아이디를 입력하세요 : ");
			String id = sc.nextLine();

			System.out.print("등록할 이름을 입력하세요 : ");
			String name = sc.nextLine();

			String sql = "insert into t_test(id,name)" + " values(\'" + id + "\',\'" + name + "\') "; // 세미콜론 sql 문장 안에
																										// 안붙어, '표시 필요

//			String sql = "insert into t_test(id,name)"+
//				         " values('park','박길동') "; // 세미콜론 sql 문장 안에 안붙어

			// 4단계
			int cnt = st.executeUpdate(sql);
			System.out.println("총 " + cnt + "개 행이 삽입");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (st != null) {
				try {
					st.close();
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
