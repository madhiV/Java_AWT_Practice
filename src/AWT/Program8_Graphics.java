package AWT;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Font;
class L extends Frame{
    L(){
        setBackground(Color.PINK);
        setVisible(true);
        setBounds(10,10,1000,1000);
        setResizable(false);
    }
    @Override
    public void paint(Graphics g){
        g.setFont(new Font("Times New Roman",Font.BOLD,12));
        g.drawString("Madhi",150,150);
        g.draw3DRect(200,200,500,600,true);
        g.drawOval(100,100,200,100);
    }
}
public class Program8_Graphics {
    public static void main(String[] args){
        new L();
    }
}
