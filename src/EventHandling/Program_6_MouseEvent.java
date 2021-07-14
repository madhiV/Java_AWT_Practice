package EventHandling;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
class V extends Frame{
    int x,y;
    V(){
        setBounds(10,10,1000,1000);
        setVisible(true);
        setResizable(false);
        setLayout(null);

        addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                getGraphics().drawLine(x,y,x+50,y+50);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                setTitle(x+" "+y);
            }
        });
        }
}
public class Program_6_MouseEvent {
    public static void main(String[] args){
        new V();
    }
}
