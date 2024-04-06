package Lists;
import java.io.*;
public class FolderexistsApp 
{
    public static void main(String[] args) 
    {
        File f = new File("D:\\Core Java\\File Handling\\Data");
        boolean b = f.exists();
        if(b)
        {
            System.out.println("Folder already exists....");
        }    
        else
        {
            b = f.mkdir();
            if(b)
            {
                System.out.println("Folder is already created....");
            }
            else
            {
                System.out.println("There might be some issue...");
            }
        }
    }
}
