package Swings;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
class C extends JFrame{
    JTable tbl;
    JScrollPane scr_pane;
    C(){
        setBounds(10,10,1000,1000);
        Object[][] entry={
                {1,"Madhi","Cbe"},{2,"Mohan","Mtp"},{3,"Ezhil","Bangalore"}
        };
        Object[] r={"S.No","Name","City"};
        tbl=new JTable(entry,r);
        scr_pane=new JScrollPane(tbl);
        add(scr_pane);
        setVisible(true);
        setLayout(null);
        setResizable(false);
    }
}
public class Program6 {
    public static void main(String[] args){
        new C();
    }
}
