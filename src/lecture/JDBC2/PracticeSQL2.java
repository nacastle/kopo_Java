package lecture.JDBC2;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lecture.SQLUtil.ConnectionFactory;
import lecture.SQLUtil.JDBCClose;

public class PracticeSQL2 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);

		try {

			ConnectionFactory cf = new ConnectionFactory();
			conn = cf.getConnection("jdbc:oracle:thin:@172.16.88.129:1521:xe","hr","hr");

			InputStream is = System.in;
			System.out.println("sql문을 입력하세요");
			StringBuilder sql = new StringBuilder();
			while(true) {
				int c = is.read();
				if(c == ';') break;
				if(c == 10 || c == 13) {
					sql.append(c == 10 ? " " : "");
				} else
					sql.append((char)c);
			}
			
			ps = conn.prepareStatement(sql.toString());
			

			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {

				String job_title = rs.getString(1);
				String avgSal = rs.getString(2); // sql은 idx 1 부터 배열 시작

//				if(id != null) {

				System.out.printf("%-3s: %-35s %-3s: %-10s\n", "job_title", job_title, "avgSal", avgSal);
				
			} 

		}

		     catch (Exception e) {
			e.printStackTrace();
	} finally {
			JDBCClose.close(conn, ps);

		}

	    
	}
}


