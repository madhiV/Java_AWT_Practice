package EventHandling;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Font;
import java.awt.CheckboxGroup;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class Z extends Frame{
    TextField t1,t2;
    Choice c1;
    Checkbox b1,b2,b3,b4,b5,b6,b7;
    Button button;
    Label l1,l2,l3,l4,l5,l6;
    CheckboxGroup cbj;
    TextArea a1;
    Z(){
        setFont(new Font("Times New Roman",Font.BOLD,12));
        setBounds(10,10,1000,1000);
        setVisible(true);
        setResizable(true);
        setLayout(null);

        //TextField
        l6=new Label("Wine shop!!!");
        l6.setBounds(30,30,120,70);

        //Label
        l1=new Label("Username : ");
        l1.setBounds(10,120,100,50);
        l2=new Label("Age : ");
        l2.setBounds(10,170,100,50);
        l3=new Label("Products : ");
        l3.setBounds(10,220,100,50);
        l4=new Label("Gender : ");
        l4.setBounds(10,270,100,50);
        l5=new Label("Password : ");
        l5.setBounds(10,320,100,50);

        cbj=new CheckboxGroup();
        b6=new Checkbox("Male",cbj,true);
        b6.setBounds(110,270,100,50);
        b7=new Checkbox("Female",cbj,false);
        b7.setBounds(210,270,100,50);

        //Choice
        c1=new Choice();
        c1.add("<10");
        c1.add("<18");
        c1.add("<25");
        c1.add("50+");
        c1.setBounds(110,170,100,50);

        //Checkboxes
        b1=new Checkbox("Old monk");
        b1.setBounds(110,220,120,50);
        b2=new Checkbox("Baccardi Limon");
        b2.setBounds(230,220,120,50);
        b3=new Checkbox("Jack daniels");
        b3.setBounds(350,220,120,50);
        b4=new Checkbox("Baccardi Black");
        b4.setBounds(470,220,120,50);
        b5=new Checkbox("Kingfisher beer");
        b5.setBounds(590,220,120,50);

        //TextFields
        t1=new TextField();
        t1.setBounds(110,120,100,30);
        t2=new TextField();
        t2.setEchoChar('*');
        t2.setBounds(110,320,100,50);

        //Button
        button=new Button("Buy");
        button.setBounds(110,380,150,85);
        button.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                String s1,s2;
                s1=t1.getText();
                s2=t2.getText();

                System.out.println("Username : "+s1);
                System.out.println("Password : "+s2);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(t1);
        add(t2);
        add(l6);
        add(c1);
        add(button);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);

        setResizable(false);
    }
}

public class Program_8_getting_input {
    public static void main(String[] args){
        new Z();
    }
}
