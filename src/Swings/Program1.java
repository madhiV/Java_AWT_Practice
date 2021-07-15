package Swings;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class A extends JFrame{
    Container c;
    JButton b;
    A() {
        setSize(1000,1000);
        setVisible(true);
        setLayout(new FlowLayout());
        c=getContentPane();
        c.setBackground(Color.PINK);
        b=new JButton("Click");
        b.setBounds(50,50,100,50);
        add(b);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
public class Program1 {
    public static void main(String[] args){
        new A();
    }
}
