package Swings;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
class B extends JFrame{
    JButton b1,b2;
    ImageIcon icon;
    JLabel lbl1;
    B(){
        setBounds(10,10,1000,1000);
        setVisible(true);
        setResizable(false);
        setLayout(new FlowLayout());

        icon=new ImageIcon("C:\\Users\\vadha\\Downloads\\Circles-3.gif");
        icon.setDescription("Sample icon");

        lbl1=new JLabel("Sample : ");
        lbl1.setBounds(200,200,100,50);
        b1=new JButton("Click");

        b2=new JButton(icon);

        b1.setBounds(50,50,100,50);
        b2.setBounds(50,150,200,100);

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        add(lbl1);
        add(b1);
        add(b2);
    }
}
public class Program2_JButton {
    public static void main(String[] args){
        new B();
    }
}
