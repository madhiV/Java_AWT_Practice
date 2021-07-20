package Swings;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTree;
import java.awt.*;

class D extends JFrame{
    DefaultMutableTreeNode n1,n2,n3,c1,c2,c3,c4,c5,c6,v1;
    JTree tree;
    D(){
        setBounds(10,10,1000,1000);
        setResizable(false);

        n1=new DefaultMutableTreeNode("Madhi home");
        n2=new DefaultMutableTreeNode("Karthi home");
        n3=new DefaultMutableTreeNode("Thamarai home");

        c1=new DefaultMutableTreeNode("Madhi");
        c2=new DefaultMutableTreeNode("Ezhil");
        c3= new DefaultMutableTreeNode("Karthi");
        c4=new DefaultMutableTreeNode("Udhaya");
        c5=new DefaultMutableTreeNode("Thamarai");
        c6=new DefaultMutableTreeNode("Dhanushri");

        n1.add(c1);
        n1.add(c2);
        n2.add(c3);
        n2.add(c4);
        n3.add(c5);
        n3.add(c6);

        v1=new DefaultMutableTreeNode("Families");
        v1.add(n1);
        v1.add(n2);
        v1.add(n3);

        tree=new JTree(v1);
        add(tree, BorderLayout.WEST);
        setVisible(true);
    }
}
class Program_5 extends JFrame
{
    public static void main(String[] args){
        new D();
    }
}
