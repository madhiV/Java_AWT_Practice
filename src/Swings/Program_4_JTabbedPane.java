package Swings;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
class L extends JFrame{
    JTabbedPane tab;
    L(){
        setFont(new Font("Times New Roman",Font.BOLD,18));
        setBounds(10,10,1000,1000);
        //setLayout(null);
        tab=new JTabbedPane(JTabbedPane.LEFT);
        tab.addTab("SIGN UP",new Tab2());
        tab.addTab("LOGIN",new Tab1());
        add(tab,BorderLayout.CENTER);
        setVisible(true);
        setResizable(false);
    }
}
class Tab1 extends JPanel{
    JLabel lbl_1,lbl_2;
    JTextField txt_1,txt_2;
    JButton btn_1;
    Tab1(){
        setLayout(null);
        lbl_1=new JLabel("Username : ");
        lbl_2=new JLabel("Password : ");

        txt_1=new JTextField();
        txt_2=new JTextField();

        lbl_1.setBounds(20,20,100,50);
        lbl_2.setBounds(20,70,100,50);

        txt_1.setBounds(120,20,100,50);
        txt_2.setBounds(120,70,100,50);

        btn_1=new JButton("Login");
        btn_1.setBounds(120,120,100,50);

        addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                txt_1.setText(((Integer)e.getX()).toString());
            }
        });
        add(lbl_1);
        add(lbl_2);
        add(txt_1);
        add(txt_2);
        add(btn_1);
    }
}
class Tab2 extends JPanel{
    JLabel lbl_1,lbl_2,lbl_3,lbl_4;
    JTextField txt_1,txt_2,txt_3,txt_4;
    JButton btn_1;
    Tab2(){
        setLayout(null);
            lbl_1=new JLabel("Username : ");
            lbl_2=new JLabel("Email : ");
            lbl_3=new JLabel("Password : ");
            lbl_4=new JLabel("Re-type Password : ");

            txt_1=new JTextField();
            txt_2=new JTextField();
            txt_3=new JTextField();
            txt_4=new JTextField();

            lbl_1.setBounds(20,20,100,50);
            lbl_2.setBounds(20,70,100,50);
            lbl_3.setBounds(20,120,100,50);
            lbl_4.setBounds(20,170,100,50);

            txt_1.setBounds(120,20,100,50);
            txt_2.setBounds(120,70,100,50);
            txt_3.setBounds(120,120,100,50);
            txt_4.setBounds(120,170,100,50);

            btn_1=new JButton("Sign up");
            btn_1.setBounds(120,220,100,50);

            add(lbl_1);
            add(lbl_2);
            add(lbl_3);
            add(lbl_4);
            add(txt_1);
            add(txt_2);
            add(txt_3);
            add(txt_4);
            add(btn_1);
        }
}
public class Program_4_JTabbedPane {
    public static void main(String[] args){
        new L();
    }
}
