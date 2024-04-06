package Lists;
import java.io.*;
import java.util.Scanner;
public class FileWriterApp 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("D:\\Core Java\\File Handling\\Data\\ABC.doc",false);
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter the String Data:");
        String data  =  xyz.nextLine();
        fw.write(data);
        fw.close();
        System.out.println("Data has been saved Successfully....");
    }
}
