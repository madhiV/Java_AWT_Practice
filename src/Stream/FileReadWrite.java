package Stream;
import java.io.FileReader;
import java.io.FileWriter;
public class FileReadWrite {
    public static void main(String[] args) throws Exception{
        FileWriter f=new FileWriter("C:\\Users\\vadha\\OneDrive\\Desktop\\NoteFiles\\Diet.txt");
        String s=new String("Im Madhi from IntelliJ");
        f.write(s);
        f.close();
        FileReader file=new FileReader("C:\\Users\\vadha\\OneDrive\\Desktop\\NoteFiles\\Diet.txt");
        int c;
        while((c=file.read())!=-1){
            System.out.print((char)c);
        }
    }
}