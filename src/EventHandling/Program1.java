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
        I k=new I() {
            @Override
            public void print() {
                System.out.println("From anonymous class");
            }
        };
        k.print();
    }
}
