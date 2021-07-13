package EventHandling;
interface M{
    public void register();
}
class B implements M{
    @Override
    public void register(){
        System.out.println("B registration !!!");
    }
}
public class Program2_Interface {
    public static void main(String[] args){
        new B().register();
        new M(){
            @Override
            public void register(){
                System.out.println("Anonumous registration !!!");
            }
        }.register();
    }
}
