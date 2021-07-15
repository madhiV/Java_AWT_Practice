package EventHandling;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.Font;
class K extends Frame{
    TextField t1,t2;
    Label l1,l2;
    String s;
    K(){
        setFont(new Font("Times new roman",Font.BOLD,12));
        setBounds(10,10,1000,1000);
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setTitle("50");

        l1=new Label("Name : ");
        l2=new Label("Re-enter name : ");
        l1.setBounds(20,30,250,50);
        l2.setBounds(20,80,250,50);

        t1=new TextField();
        t2=new TextField();
        t1.setBounds(270,30,100,50);
        t2.setBounds(270,80,100,50);
        t1.addTextListener(new TextListener(){
            @Override
            public void textValueChanged(TextEvent e){
                s=t1.getText();
                t2.setText(s);
            }
        });
        t2.setEchoChar('*');

        add(t1);
        add(t2);
        add(l1);
        add(l2);
    }
}
public class Program_5_TextEvent {
    public static void main(String[] args){
        new K();
    }
}

