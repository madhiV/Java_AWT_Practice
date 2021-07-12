package AWT;
import java.awt.Frame;
import java.awt.Color;
import java.awt.TextField;
class B extends Frame{
    TextField t1,t2;
    B(){
        setBounds(10,10,1000,1000);
        setLayout(null);
        setBackground(Color.BLACK);
        t1=new TextField();
        //t1.setBackground(Color.YELLOW);
        t2=new TextField();
        //t2.setBackground(Color.BLUE);
        t1.setBounds(10,15,100,100);
        t2.setBounds(110,15,100,100);
        add(t1);
        add(t2);
        setVisible(true);
    }

}
public class Program3_TEXTFIELD {
    public static void main(String... args){
        new B();
    }
}
