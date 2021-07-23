package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class Program5_FetchTable {
    public void printTable() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","madhi","java");
        Statement statement=conn.createStatement();
        String s="select * from employee";
        ResultSet k=statement.executeQuery(s);
        while(k.next()){
            System.out.print(k.getString("name"));
            System.out.print("  "+k.getString(2));
            System.out.print("  "+k.getInt(3));
            System.out.println();
        }
        System.out.println("Success ");
        conn.close();
    }
    public static void main(String[] args) throws Exception{
        new Program5_FetchTable().printTable();
    }
}
