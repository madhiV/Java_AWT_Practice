package EventHandling;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;
import java.awt.Color;
class L extends Frame implements ActionListener{
    TextField t1,t2;
    L(){
        t2=new TextField();
        t1=new TextField();
        t1.setBounds(50,50,100,50);
        t1.addActionListener(this);
        t2.setBounds(50,150,100,50);
        t2.addActionListener(this);

        setBounds(10,10,1000,1000);
        setLayout(null);
        setVisible(true);

        add(t1);
        add(t2);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object temp=e.getSource();
        if(temp==t1) {
            setBackground(Color.BLACK);
        }
        else{
            setBackground(Color.BLUE);
        }

    }
}
public class Program_7_implementing_ActionEvent {
    public static void main(String[] args){
        new L();
    }
}
