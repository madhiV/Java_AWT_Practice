package D_01_07_2021;
import java.util.*;
public class I {
    public static void main(String[] atds){
        String s;
        char c;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        c=s.charAt(0);
        int n=Integer.parseInt(c+"");
        System.out.println(n);
        n=(int)(Math.random()*50);
        for(int i=0;i<10;i++){
            System.out.println((int)(Math.random()*10));
        }
    }
}
