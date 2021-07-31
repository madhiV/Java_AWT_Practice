package jdbc;
import java.awt.*;
import javax.swing.*;
import java.util.*;

class A extends JFrame{
    JTabbedPane tabs;

    A(){
        setBounds(10,10,1000,1000);

        tabs=new JTabbedPane(JTabbedPane.LEFT);
        tabs.addTab("SIGN UP",new SignUp());

        add(tabs,BorderLayout.CENTER);
        setVisible(true);
        setResizable(false);
    }
}
class SignUp extends JPanel{
    Button btn_1;
    TextArea txt_ar1;
    TextField txt_fld1,txt_fld2,txt_fld3,txt_fld4,txt_fld5,txt_fld6;
    Label lbl_1,lbl_2,lbl_3,lbl_4,lbl_5,lbl_6;
    SignUp(){
        setFont(new Font("Times New Roman",Font.BOLD,18));
        setLayout(null);
        txt_ar1=new TextArea("6478!2");
        txt_ar1.setBounds(200,300,180,50);
        txt_ar1.setEditable(false);

        lbl_1=new Label("First Name : ");
        txt_fld1=new TextField();
        lbl_2=new Label("Last Name : ");
        txt_fld2=new TextField();
        lbl_3=new Label("E-mail : ");
        txt_fld3=new TextField();
        lbl_4=new Label("Password : ");
        txt_fld4=new TextField();
        lbl_5=new Label("Re enter password : ");
        txt_fld5=new TextField();
        lbl_6=new Label("Enter Captcha: ");
        txt_fld6=new TextField();

        txt_fld4.setEchoChar('*');
        txt_fld5.setEchoChar('*');

        lbl_1.setBounds(20,50,180,50);
        lbl_2.setBounds(20,100,180,50);
        lbl_3.setBounds(20,150,180,50);
        lbl_4.setBounds(20,200,180,50);
        lbl_5.setBounds(20,250,180,50);
        lbl_6.setBounds(20,350,180,50);

        txt_fld1.setBounds(200,50,180,50);
        txt_fld2.setBounds(200,100,180,50);
        txt_fld3.setBounds(200,150,180,50);
        txt_fld4.setBounds(200,200,180,50);
        txt_fld5.setBounds(200,250,180,50);
        txt_fld6.setBounds(200,350,180,50);

        btn_1=new Button("Sign up");
        btn_1.setBounds(200,400,180,50);

        add(lbl_1);
        add(lbl_2);
        add(lbl_3);
        add(lbl_4);
        add(lbl_5);
        add(lbl_6);
        add(btn_1);
        add(txt_ar1);
        add(txt_fld1);
        add(txt_fld2);
        add(txt_fld3);
        add(txt_fld4);
        add(txt_fld5);
        add(txt_fld6);
    }
}
public class Program7_db_with_awt {
    public static void main(String[] args){
        new A();
    }
}
