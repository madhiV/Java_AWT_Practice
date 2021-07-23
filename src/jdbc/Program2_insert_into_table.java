package jdbc;
/*
conn / as sysdba
conn
madhi
java
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
public class Program2_insert_into_table {
    public static void main(String[] args) throws Exception{
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
        Statement s=conn.createStatement();
        String q="insert into employee values('"+name+"','"+company+"',"+salary+")";
        s.executeUpdate(q);
        conn.setAutoCommit(true);
        conn.close();
        System.out.println("Success insertion");
    }
}
