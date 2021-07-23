package jdbc;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
public class Program4_PreparedStatement {
    public static void main(String[] args1) throws Exception{
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
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","madhi","java");
        String query ="insert into employee values(?,?,?)";
        PreparedStatement pst=conn.prepareStatement(query);
        pst.setString(1,name);
        pst.setString(2,company);
        pst.setInt(3,salary);
        pst.executeUpdate();
        conn.setAutoCommit(true);
        conn.close();
        System.out.println("Success insertion");
    }
}
