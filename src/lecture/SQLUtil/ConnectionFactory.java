package lecture.SQLUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	

	
	public Connection getConnection (String url, String user, String pwd) {
		
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
//			String url = "jdbc:oracle:thin:@172.16.88.129:1521:xe";
//			String user = "hr";
//			String pwd = "hr";
			
			conn = DriverManager.getConnection(url,user,pwd);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return conn;
		
	}

}
