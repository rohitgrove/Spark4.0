import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCCinsterDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root",
                    "rohit@8708004879");
            Statement statement = con.createStatement();

            String query = "INSERT INTO student (id, stdName, age) values (4, 'Ankit', 21)";
            int upadte = statement.executeUpdate(query);
            System.out.println("inserted " + upadte + " rows");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
