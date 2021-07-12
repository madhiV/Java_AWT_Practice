package Stream;
import java.io.*;
public class File_ {
    public static void main(String[] args) throws Exception{
        java.io.File file=new java.io.File("C:\\Users\\vadha\\OneDrive\\Desktop\\NoteFiles\\Diet.txt");
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.exists());
        System.out.println(file.lastModified());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
    }
}
