package EventHandling;
interface I{
    public void print();
}
class A implements I{
    @Override
    public void print(){

    }
}
public class Program1 {
    public static void main(String[] args){
        I k=new I{
            public void print(){
                System.out.println("Printing from anonymous class which implements interface I");
            }
        }.print();
    }
}
