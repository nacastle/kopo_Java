package lecture.JDBC2;

import java.io.InputStream;

public class Practice  {
	public static void main(String[] args) throws Exception{
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
		
		System.out.println(sql);
		
	}
	
	
	

}
