import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCUpdateDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root",
                    "rohit@8708004879");
            Statement statement = con.createStatement();

            String query = "UPDATE student set age = 23 where id = 1";
            int upadte = statement.executeUpdate(query);
            System.out.println("inserted " + upadte + " rows");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
