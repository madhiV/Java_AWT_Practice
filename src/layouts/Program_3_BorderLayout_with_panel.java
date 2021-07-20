package layouts;
import java.awt.Frame;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.Button;
class S extends Frame{
    Button btn1,btn2;
    S(){
        setLayout(new BorderLayout());
        btn1=new Button("File");
        btn2=new Button("Edit");
        add(new M(),BorderLayout.WEST);
        setBounds(10,10,1000,1000);
        setVisible(true);
    }
}
class K extends Panel{
    Button btn1,btn2;
    K(){
        add(new Button("New"));
        add(new Button("Open"));
        add(new Button("Save"));
        add(new Button("Save as"));
    }
}
class M extends Panel{
    M(){
        add(new Button("New"));
        add(new Button("Open"));
        add(new Button("Save"));
        add(new Button("Save as"));
    }
}
public class Program_3_BorderLayout_with_panel {
    public static void main(String[] args) {
        new S();
    }
}
