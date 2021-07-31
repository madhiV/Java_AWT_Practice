package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class Program3_delete_from_table {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","madhi","java");
        Statement statement=conn.createStatement();
        String query="Delete from employee where name='Madhi'";
        conn.setAutoCommit(true);
        statement.executeUpdate(query);
        conn.close();
        System.out.println("Deletion success");
    }
}
