package layouts;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
class Q extends Frame{
    Q(){
        setBounds(10,10,1000,1000);
        setLayout(new GridLayout(3,3));
        add(new M());
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        add(new Button("Click"));
        setVisible(true);
    }
}
public class Program_4_GridLayout {
    public static void main(String[] args){
        new Q();
    }
}
