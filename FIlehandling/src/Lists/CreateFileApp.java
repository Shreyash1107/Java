package Lists;
import java.io.*;
public class CreateFileApp 
{
    public static void main(String[] args) throws IOException 
    {
        File f = new File("D:\\Core Java\\File Handling\\Data\\ABC.doc");
        boolean b = f.createNewFile();
        if(b)
        {
            System.out.println("File has been Creeated Successfully...");
        }   
        else
        {
            System.out.println("THere is some Problem...");
        }
    }
}
