package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ConnectDatabase {
    //    private static Connection connect = null;
//    static String user ="root";
//    static String pass = "1234567908";
//    static int port = 3306;
//    static String databaseName = "EduSys";

    public static Connection getSqlConnection(String user, String pass, String databaseName, int port) {
        String db_url = "";
        Connection connect = null;
        if (port == 3306) {
            db_url = "jdbc:mysql://localhost:" + port + "/" + databaseName;
        } else {
            db_url = "jdbc:sqlserver://localhost:" + port + ";databaseName=" + databaseName + ";";
        }

        try {
            connect = (Connection) DriverManager.getConnection(db_url, user, pass);
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối: " + ex);
        }
//        System.out.println(connect);
        return connect;
    }

    public static PreparedStatement getStmt(String sql, Object... args) {
        Connection connect = getSqlConnection("sa", "123456", "QLNHAHANG_NHOM3", 1433);
        PreparedStatement pstmt = null;
        try {
            pstmt = connect.prepareCall(sql) ;

//                if (sql.trim().startsWith("{")) {
//                    pstmt = connect.prepareCall(sql);
//                } 
//                else {
//                    pstmt = connect.prepareStatement(sql);
//                } 
             

            for (int i = 0; i < args.length; i++) {
                pstmt.setObject(i + 1, args[i]);
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối: " + ex);
        }
        return pstmt;
    }

    
    public static ResultSet queryData(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println("Lỗi 'queryData': " + ex);
            throw new RuntimeException(ex);
        }
//        return null;
    }

    public static int updateData(String sql, Object... args) {
        try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Lỗi 'updateData': " + ex);
        }
        return 0;
    }

    public static Object value(String sql, Object... args) throws SQLException {
        ResultSet rs = queryData(sql, args);
        if (rs.next()){
            return rs.getObject(0);
        }
        
        rs.getStatement().getConnection().close();
        return null;
    }
    
    
    public static List<Object[]> valueList(String sql, int numCols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = queryData(sql, args);
            if(rs == null) {
                return null;
            }
            while (rs.next()) {
                Object[] row = new Object[numCols];
                for (int i = 0; i < numCols; i++) {
                    row[i] = rs.getObject(i + 1);
                }
                list.add(row);
            }
            return list;
        } catch (Exception e) {
            System.out.println("Lỗi 'value': " + e);
        }
        return null;
    }
}
