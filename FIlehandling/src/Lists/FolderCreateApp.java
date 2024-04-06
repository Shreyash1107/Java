package Lists;
import java.io.*;
public class FolderCreateApp 
{
    public static void main(String[] args) 
    {
        File f = new File("D:\\Core Java\\File Handling\\Data");    
        boolean b = f.mkdir();
        if(b)
        {
            System.out.println("Folder has been Successfully Created.......");
        }
        else
        {
            System.out.println("Some Problem is there.......");
        }
    }
}
