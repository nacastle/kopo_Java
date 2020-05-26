package UserPractice;

import JDBCUtil.ConnectionFactory;
import JDBCUtil.JDBCClose;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PracticeSQL {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {

            // 드라이버 받고 connect해서 connection 변수 하나 생성
            conn = new ConnectionFactory().getConnection();

            // sql문 작성
            StringBuilder sql = new StringBuilder();
            sql.append("select id, pwd ");
            sql.append(" from t_user ");

            // 작성할 sql문 실행할 준비 하기?
            pstmt = conn.prepareStatement(sql.toString());

            // sql 결과문 담을 준비하고(객체 rs생성) sql문 실행하기
//            Map<String,String> userMap = um.getUserMap();
            ResultSet rs = pstmt.executeQuery();
            UserList um = new UserList();
//            um.getUserList();

            while (rs.next()) {

                um.setId(rs.getString(1));
                um.setPwd(rs.getString(2));
                um.getUserList().put(um.getId(),um.getPwd());
            }

            for (String key : um.getUserList().keySet()) {
                String value = um.getUserList().get(key);
                System.out.println(key + ", " + value);
            }



            // sql문 실행
//            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // 접속종료
            JDBCClose.close(conn, pstmt);
        }

    }


}
