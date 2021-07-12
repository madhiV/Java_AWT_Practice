package AWT;
import java.awt.*;
class A extends Frame{
    A(){
        //setBounds(10,10,1000,1000);
        setSize(1000,1000);
        //setLocation(50,500);
        setLayout(null);
        setBackground(Color.YELLOW);
        setVisible(true);
    }
}
public class Program2_EXTENDING_FRAME {
    public static void main(String... args){
        A a=new A();
    }
}
