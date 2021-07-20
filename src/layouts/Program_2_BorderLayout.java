package layouts;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Button;
class B extends Frame{
    Button b1,b2;
    B(){
        setLayout(new BorderLayout());
        b1=new Button("File");
        b2=new Button("Edit");
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.EAST);
        add(new Button("View"),BorderLayout.WEST);
        add(new Button("Windows"),BorderLayout.SOUTH);
        //add(new Button("Help"),BorderLayout.NORTH);
        setBounds(10,10,1000,1000);
        setVisible(true);
    }
}
public class Program_2_BorderLayout {
    public static void main(String[] args){
        new B();
    }
}
