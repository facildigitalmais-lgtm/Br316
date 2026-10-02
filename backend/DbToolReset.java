import java.sql.*;
import org.traccar.helper.Hashing;

public class DbToolReset {
    public static void main(String[] args) {
        String url = "jdbc:h2:file:C:/Codes/BR101/backend/target/database";
        String user = "sa";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            
            System.out.println("--- RESETTING PASSWORD ---");
            Hashing.HashingResult result = Hashing.createHash("admin");
            String hash = result.getHash();
            String salt = result.getSalt();
            
            try (PreparedStatement pstmt = conn.prepareStatement(
                    "UPDATE tc_users SET hashedpassword = ?, salt = ? WHERE email = ?")) {
                pstmt.setString(1, hash);
                pstmt.setString(2, salt);
                pstmt.setString(3, "admin@admin.com");
                int rows = pstmt.executeUpdate();
                System.out.println("Rows updated: " + rows);
            }
            
            System.out.println("Password for admin@admin.com reset to 'admin'");
            System.out.println("--------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
