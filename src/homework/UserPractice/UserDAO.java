package UserPractice;

import JDBCUtil.ConnectionFactory;
import JDBCUtil.JDBCClose;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    public List<User> showAllUser() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        List<User> userList = new ArrayList<>();

        try {

            // 드라이버 받고 connect해서 connection 변수 하나 생성
            conn = new ConnectionFactory().getConnection();

            // sql문 작성
            StringBuilder sql = new StringBuilder();
            sql.append("select id, pwd ");
            sql.append(" from t_user ");

            // 작성할 sql문 실행할 준비 하기?
            pstmt = conn.prepareStatement(sql.toString());
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {

                String id = rs.getString(1);
                String pwd = rs.getString(2);
                User users = new User(id, pwd);
                userList.add(users);
//                System.out.println(users); // 출력까지 할지 말지는 나중에 결정
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // 접속종료
            JDBCClose.close(conn, pstmt);
        }
        return userList;
    }


}


