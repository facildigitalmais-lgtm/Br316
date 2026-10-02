import java.sql.*;

public class DbTool {
    public static void main(String[] args) {
        String url = "jdbc:h2:file:C:/Codes/BR101/backend/target/database";
        String user = "sa";
        String password = "";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            System.out.println("--- USERS LIST ---");
            ResultSet rs = stmt.executeQuery("SELECT id, email, name, administrator FROM tc_users");
            while (rs.next()) {
                System.out.println(String.format("ID: %d | Email: %s | Name: %s | Admin: %b", 
                    rs.getInt("id"), rs.getString("email"), rs.getString("name"), rs.getBoolean("administrator")));
            }
            System.out.println("------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
