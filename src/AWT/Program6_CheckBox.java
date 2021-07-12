package AWT;
import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Button;
class E extends Frame{
    Button b1;
    Checkbox c1,c2,c3,c4,c5,c6;
    CheckboxGroup cgb;
    E(){
        setBounds(10,10,1000,1000);
        setVisible(true);
        setLayout(null);

        b1=new Button("Submit");
        b1.setBounds(10,350,120,70);

        c1=new Checkbox("Java");
        c2=new Checkbox("Python");
        c3=new Checkbox("C");
        c4=new Checkbox("C++");

        c1.setBounds(10,20,100,50);
        c2.setBounds(10,70,100,50);
        c3.setBounds(10,120,100,50);
        c4.setBounds(10,170,100,50);

        c5=new Checkbox("Male",cgb,true);
        c6=new Checkbox("Female",cgb,false);

        c5.setBounds(10,220,100,50);
        c6.setBounds(10,270,100,50);

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c6);
        add(c5);
        add(b1);
    }
}
public class Program6_CheckBox {
    public static void main(String... args){
        new E();
    }
}
