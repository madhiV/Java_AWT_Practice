package MultiThreading;
class A implements Runnable{
    @Override
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Hello from class A");
                Thread.sleep(1000);
            }
        }
        catch(Exception r){

        }
    }
    void t(){
        new Thread(this).start();
    }
}
class B implements Runnable{
    @Override
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("Hello from class B");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){

        }
    }
    void t(){
        new Thread(this).start();
    }
}
public class Implement {
    public static void main(String... args){
        A obj1=new A();
        B obj2=new B();
        obj1.t();
        obj2.t();
    }
}
