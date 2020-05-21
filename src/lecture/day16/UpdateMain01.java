package lecture.day16;

/*
    ID를 입력하새요 : lee
    변경할 이름을 입력하세요: 이길동
    1개의 행이 변경 되었습니다.


*/

import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateMain01 {



    public static void main(String[] args) {



           Connection conn = null;

        try {
            //1단계


            Class.forName("oracle.jdbc.driver.OracleDriver");

            String url = "jdbc.oracle:thin:@172.16.88.120:1521:dink";
            String user = "DA14";
            String pwd = "4704";
            conn = DriverManager.getConnection(url,user,pwd);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (conn != null) {

            }

        }


    }


}
