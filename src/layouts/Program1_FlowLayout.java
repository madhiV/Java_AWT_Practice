package layouts;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Frame;
class A extends Frame{
    Button b1;
    A(){
        setLayout(new FlowLayout());
        b1=new Button("Submit");
        add(b1);
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        setBounds(10,10,1000,1000);
        setVisible(true);
    }
}
public class Program1_FlowLayout {
    public static void main(String[] args){
        new A();
    }
}
