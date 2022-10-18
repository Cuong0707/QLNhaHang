package CT;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CheckInput {

    public static boolean checkEmpty(String txt, String hint) {
        // Nếu chuỗi txt rỗng, thông báo "hint" cho người dùng biết và trả về giá trị true
        if (txt.equals("")) {
            JOptionPane.showMessageDialog(null, hint, "Lỗi", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        // Ngược lại trả về giá trị false
        return false;
    }

    public static boolean checkRegex(String txt, String regex, String hint) {
        // Nếu chuỗi txt không so khớp với biểu thức chính quy "regex", thông báo "hint" cho người dùng biết và trả về giá trị true
        if (!txt.matches(regex)) {
            JOptionPane.showMessageDialog(null, hint, "Lỗi", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        // Ngược lại trả về giá trị false
        return false;
    }
    
    public static boolean checkDuplicate(String txt, Connection con, String tableName, String colName) {
        
        try {
            PreparedStatement st = con.prepareStatement("Select * From "+tableName +" Where "+ colName +" = ?;");
            st.setString(1, txt);
            ResultSet rs = st.executeQuery();
            // ResultSet cho phép truy xuất đến dữ liệu trả về từ kết quả truy vấn database
            // Gọi hàm next() để di chuyển con trỏ hiện hành đến hàng kế tiếp của ResultSet
            // Next() trả về true nghĩa là còn dữ liệu để đọc, ngược lại là không có hàng nào
            
            if (rs.next()) {
                // Nếu chuỗi txt đã có trong bảng "tableName" tại vị trí cột "ColName", 
                // thông báo "hint" cho người dùng biết và trả về giá trị true
                return true; 
            }
        } catch (SQLException ex) {
            System.out.println("Lỗi kết nối: " + ex);
        }
        
        /* Ngược lại, Nếu Lỗi kết nối 
        HOẶC dữ liệu nhập vào "JTextField" đã KHÔNG có trong bảng "tableName" tại vị trí cột "ColName" thì return False */
        return false;
    }
}
