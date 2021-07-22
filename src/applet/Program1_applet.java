package applet;
import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Font;
public class Program1_applet extends Applet{
    String s="";
    public void init()
    {
        s+="  initialized  ";
    }
    public void start(){
        s+="  Started  ";
    }
    public void stop(){
        s+="  Stop  ";
    }
    public void destroy(){
        System.out.println("Destroyed");
    }
    public void paint(Graphics g){
        g.setFont(new Font("Times New Roman",Font.BOLD,18));
        g.drawString(s,100,100);
    }
}
