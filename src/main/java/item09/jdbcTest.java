package item09;

import java.sql.*;

public class jdbcTest {
    public void JDBCExam() throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String driverName = "oracle.jdbc.driver.OracleDriver";
        String url = "oracle:thin:localhost:1521:ORCL";
        String user = "scott";
        String password = "tiger";

        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, user, password);
            pstmt = conn.prepareStatement("select ....");
            rs = pstmt.executeQuery();
            while (rs.next()){}
        } catch (ClassNotFoundException e) {
            System.out.println("[로드 오류]\n" + e.getStackTrace());
        } catch (SQLException e) {
            System.out.println("[연결 오류]\n" + e.getStackTrace());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println("[닫기 오류]\n" + e.getStackTrace());
            }
        }
    }
}
