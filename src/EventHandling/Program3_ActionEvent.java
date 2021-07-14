package EventHandling;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class C extends Frame{
    Button b;
    C(){
        setBounds(10,10,1000,1000);
        setBackground(Color.WHITE);
        setVisible(true);
        setResizable(false);
        setLayout(null);

        b=new Button("Click");
        b.setBounds(30,30,100,50);

        add(b);

        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
               // System.exit(0);
                setBackground(Color.PINK);
            }
        });
    }
}
public class Program3_ActionEvent {
    public static void main(String[] args){
        new C();
    }
}
