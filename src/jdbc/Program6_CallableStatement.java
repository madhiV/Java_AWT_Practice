package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.CallableStatement;
public class Program6_CallableStatement {
    public void insert() throws Exception{
        Scanner scanner=new Scanner(System.in);
        String name,company;
        int salary;
        System.out.println("Enter the name : ");
        name=scanner.nextLine();
        System.out.println("Enter the company : ");
        company=scanner.nextLine();
        System.out.println("Enter your salary : ");
        salary=scanner.nextInt();
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","madhi","java");
        String query="{call demo6(?,?,?)}";
        CallableStatement callableStatement=conn.prepareCall(query);
        callableStatement.setString(1,name);
        callableStatement.setString(2,company);
        callableStatement.setInt(3,salary);
        callableStatement.executeUpdate();
        conn.setAutoCommit(true);
        conn.close();
        System.out.println("Insertion success...");
    }
    public static void main(String[] args) throws Exception{
        new Program6_CallableStatement().insert();
    }
}
