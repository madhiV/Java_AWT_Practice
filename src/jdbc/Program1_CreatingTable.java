package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Program1_CreatingTable {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","madhi","java");
        Statement statement=conn.createStatement();
        String query="create table employee(name varchar(20),company varchar(10),salary int)";
        int result=statement.executeUpdate(query);
        conn.close();
        System.out.println("Creation success "+result);
    }
}
