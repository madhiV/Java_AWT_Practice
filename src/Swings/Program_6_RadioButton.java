package Swings;

import java.awt.*;
import javax.swing.*;
class O extends JFrame{
    JRadioButton btn1,btn2;
    ButtonGroup bg;
    O(){
        setBounds(10,10,1000,1000);
        setLayout(null);
        setResizable(false);
        btn1=new JRadioButton("Male");
        btn2=new JRadioButton("Female");
        btn1.setBounds(20,50,180,50);
        btn2.setBounds(200,50,180,50);
        bg=new ButtonGroup();
        bg.add(btn2);
        bg.add(btn1);
        add(btn1);
        add(btn2);
        setVisible(true);
    }
}
public class Program_6_RadioButton {
    public static void main(String[] args) {
        new O();
    }
}
