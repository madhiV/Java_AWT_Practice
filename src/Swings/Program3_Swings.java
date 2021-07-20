package Swings;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Z extends JFrame{
    JButton btn1;
    JTextField txt_fld1,txt_fld2;
    JLabel lbl1,lbl2;
    Z(){
        setBounds(10,10,1000,1000);
        setVisible(true);
        setLayout(null);
        setResizable(false);

        //Label
        lbl1=new JLabel("User name : ");
        lbl2=new JLabel("Password : ");
        lbl1.setBounds(20,20,100,50);
        lbl2.setBounds(20,70,100,50);

        //Text Field
        txt_fld1=new JTextField();
        txt_fld2=new JTextField();
        txt_fld1.setBounds(120,20,100,50);
        txt_fld2.setBounds(120,70,100 ,50);

        //Button
        btn1=new JButton("Login...");
        btn1.setBounds(120,120,100,50);
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        add(lbl1);
        add(lbl2);
        add(txt_fld1);
        add(txt_fld2);
        add(btn1);
    }
}
public class Program3_Swings {
    public static void main(String[] args){
        new Z();
    }
}
