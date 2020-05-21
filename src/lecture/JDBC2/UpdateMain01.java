package lecture.JDBC2;

import java.io.InputStream;

/*
    ID를 입력하새요 : lee
    변경할 이름을 입력하세요: 이길동
    1개의 행이 변경 되었습니다.


*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import lecture.SQLUtil.ConnectionFactory;
import lecture.SQLUtil.JDBCClose;

public class UpdateMain01 {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            //1단계

        
        	ConnectionFactory cf = new ConnectionFactory();
        	conn = cf.getConnection("jdbc:oracle:thin:@172.16.88.129:1521:xe","hr","hr");
        	
            //3단계
            
           Scanner sc = new Scanner(System.in);
           
           System.out.print("id 입력: ");
           String id = sc.nextLine();
           System.out.print("변경 이름 입력: ");
           String name = sc.nextLine();
           
//           String sql = "update t_test "+
//           				" set name = ? "+
//           				" where id = ? ";
           
//           System.out.print("SQL문 : ");
//           String sql = sc.nextLine();
           
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

           
           pstmt = conn.prepareStatement(sql.toString());
           pstmt.setString(1,name);
           pstmt.setString(2, id);
           
           //4단계
           int cnt = pstmt.executeUpdate();
           System.out.println("총 " + cnt+"행이 수정되었습니다.");
           

           



        } catch (Exception e) {
            e.printStackTrace();
        } finally {

           JDBCClose.close(conn, pstmt);


        }


    }


}
