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

public class PracticeSQL {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		Scanner sc = new Scanner(System.in);

		try {
//			conn = new ConnectionFactory().getConnection(); // 1회용.. 수행하면 가비지컬렉터가 가져감..

			ConnectionFactory cf = new ConnectionFactory();
			conn = cf.getConnection("jdbc:oracle:thin:@172.16.88.129:1521:xe","hr","hr");

//			StringBuffer sb = new StringBuffer();
//			sb.append("select id, name ");
//			sb.append("  from ( ");
//			sb.append("         select * ");
//			sb.append("           from t_test ");
//			sb.append("          order by id asc ");
//			sb.append("       ) ");
//			sb.append(" where rownum = 1");
//			
//			String sql = sb.toString();

			
//			List<String> sql = new ArrayList<>();
			
		
			  
			  
//			sql.add(sc.nextLine());
			 
			  
			System.out.println("급여가 x원 이상인 직원들에 대해, 직무별 평균급여를 출력하고자 합니다.");
			System.out.print("급여 x원을 입력하시오: ");
			String sal = sc.nextLine();
//			int sal = sc.nextInt();
//			sc.nextLine();
			
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
//			String sql = " select job_title, Trunc(avg(salary)) avg_sal from (select job_title, salary from jobs j join employees e on j.job_id = e.job_id where salary >= ? ) group by job_title order by avg_sal desc";
			
			ps = conn.prepareStatement(sql.toString());
			
			ps.setString(1,sal); // 작은 따옴표 알아서 들어감

			ResultSet rs = ps.executeQuery();

//			sc.next
			
			int cnt = 0;

			while(rs.next()) {

				String job_title = rs.getString(1);
				String avgSal = rs.getString(2); // sql은 idx 1 부터 배열 시작

//				if(id != null) {

				System.out.printf("%-3s: %-35s %-3s: %-10s\n", "job_title", job_title, "avgSal", avgSal);
				
				cnt++;
			} 
			
			System.out.println("총 " + cnt + "개");
			/*
				 * else { System.out.println(""); }
				 */

//				System.out.println('#');
		}

		     catch (Exception e) {
			e.printStackTrace();
	} finally {
			JDBCClose.close(conn, ps);

		}

	    
	}
}


