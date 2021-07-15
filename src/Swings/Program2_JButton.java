package Swings;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class B extends JFrame{
    JButton b1,b2;
    B(){
        setBounds(10,10,1000,1000);
        setVisible(true);
        setResizable(true);
        setLayout(null);

        b1=new JButton("Click");
        b2=new JButton(new ImageIcon("C:\\Files\\madhi\\DCIM\\pictures\\IMG_1148.jpeg"));

        b1.setBounds(50,50,100,50);
        b2.setBounds(50,150,100,50);

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        add(b1);
        add(b2);
    }
}
public class Program2_JButton {
    public static void main(String[] args){
        new B();
    }
}
