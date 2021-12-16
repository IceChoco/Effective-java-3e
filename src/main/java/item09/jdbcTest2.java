package item09;

import java.sql.*;

public class jdbcTest2 {
    public void JDBCExam() throws Exception {
        String driverName = "oracle.jdbc.driver.OracleDriver";
        String url = "oracle:thin:localhost:1521:ORCL";
        String user = "scott";
        String password = "tiger";

        try(Connection conn=DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt =conn.prepareStatement("select ....");
            ResultSet rs = pstmt.executeQuery()
            ){
            Class.forName(driverName);
            while (rs.next()){}
        } catch (ClassNotFoundException e) {
            System.out.println("[로드 오류]\n" + e.getStackTrace());
        } catch (SQLException e) {
            System.out.println("[연결 오류]\n" + e.getStackTrace());
        }
    }
}
