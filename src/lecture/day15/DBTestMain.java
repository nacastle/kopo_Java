package lecture.day15;

public class DBTestMain {
    public static void main(String[] args) {

        //1단계 : JDBC 드라이버 로딩

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
