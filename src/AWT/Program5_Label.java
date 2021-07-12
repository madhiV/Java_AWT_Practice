package AWT;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.TextArea;
class D extends Frame{
    Button b1;
    Label l1,l2;
    TextField t1,t2;
    TextArea a1;
    D(){
        setLayout(null);
        //setBackground(Color.BLACK);
        setBounds(10,10,1000,1000);
        setVisible(true);

        t1=new TextField();
        t2=new TextField();
        t1.setBounds(100,100,100,50);
        t2.setBounds(100,160,100,50);

        l1=new Label("Username : ");
        l2=new Label("Password : ");
        //l1.setBackground(Color.BLUE);
        //l2.setBackground(Color.BLUE);
        l1.setBounds(10,100,100,50);
        l2.setBounds(10,160,100,50);

        a1=new TextArea("My first AWT program : ");
        a1.setBounds(10,50,500,50);

        add(a1);
        t2.setEchoChar('*');
        b1=new Button("Submit");
        b1.setBounds(100,220,100,50);
        add(b1);
        add(t1);
        add(t2);
        add(l1);
        add(l2);
        setResizable(false);
    }
}
public class Program5_Label {
    public static void main(String... args){
        new D();
    }
}
