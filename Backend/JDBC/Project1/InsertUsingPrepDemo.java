import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertUsingPrepDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root",
                    "rohit@8708004879");


            String query = "INSERT INTO student (id, stdName, age) values (?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setInt(1, 101);
            pstmt.setString(2, "Mohit");
            pstmt.setInt(3, 13);

            pstmt.setInt(1, 102);
            pstmt.setString(2, "Raj");
            pstmt.setInt(3, 23);

            int update = pstmt.executeUpdate();
            System.out.println("rows updated ==> " + update);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
