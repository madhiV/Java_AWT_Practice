package AWT;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Rectangle;
public class Program1_FRAME_OBJECT {
    public static void main(String... args){
        Frame f=new Frame();
        f.setLayout(null);
        f.setBackground(Color.BLUE);
        f.setVisible(true);
        f.setBounds(new Rectangle(500,10,1000,1000));
    }
}
