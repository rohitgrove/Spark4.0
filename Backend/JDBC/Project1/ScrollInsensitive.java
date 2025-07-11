import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver class
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd", "root",
                    "rohit@8708004879");
            Statement statement = con.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            System.out.println("-----------Scroll insensitive, read only ------------");
            String query = "select * from student";
            ResultSet rs = statement.executeQuery(query);
            rs.last();
            System.out.println("Last Row: " + rs.getInt("id"));
            System.out.println("Last Row: " + rs.getString("stdName"));

            rs.first();
            System.out.println("Last Row: " + rs.getInt("id"));
            System.out.println("Last Row: " + rs.getString("stdName"));

            rs.absolute(2);
            System.out.println("Last Row: " + rs.getInt("id"));
            System.out.println("Last Row: " + rs.getString("stdName"));
            // System.out.println("--------------Read Data -----------------");
            // while (rs.next()) {
            // System.out.println(
            // rs.getInt("id") + " | " +
            // rs.getString("stdName") + " | " +
            // rs.getInt("age")
            // );
            // }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
