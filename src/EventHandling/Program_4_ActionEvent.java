package EventHandling;
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
class F extends Frame{
    Button b;
    F(){
        setBounds(10,10,1000,1000);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        b=new Button("Click to change...");
        b.setBounds(30,50,500,50);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setBounds(50,50,1000,1000);
                setBackground(Color.PINK);
            }
        });
        add(b);
    }
}
public class Program_4_ActionEvent {
    public static void main(String[] args){
        new F();
    }
}
