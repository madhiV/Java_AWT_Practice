package Swings;
import java.awt.*;
import javax.swing.*;

class C extends JFrame{
    JTabbedPane tab1,tab2;
    C(){
        setBounds(10,10,1000,1000);
        setVisible(true);
        setLayout(new BorderLayout());

        tab1=new JTabbedPane(JTabbedPane.TOP);

        tab1.addTab("File",new Z());
        tab1.addTab("View",new W());

        add(tab1);
    }

}
class Z extends JPanel{
    Z(){
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        setBackground(Color.BLACK);
    }
}
class W extends JPanel{
    W(){
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        add(new JButton("Submit"));
        setBackground(Color.BLUE);
    }
}
public class Program3_TabbedPane {
    public static void main(String[] args){
        new C();
    }
}
