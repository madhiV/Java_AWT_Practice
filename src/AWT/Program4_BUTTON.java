package AWT;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Button;
class C extends Frame{
    Button b1;
    C(){
        setVisible(true);
        setBounds(10,10,1000,1000);
        setBackground(Color.WHITE);
        setLayout(null);
        b1=new Button("Click me");
        b1.setBounds(20,20,100,100);
        add(b1);
        b1.setBackground(Color.BLUE);
    }
}
public class Program4_BUTTON {
    public static void main(String... ardgs){
        new C();
    }
}
