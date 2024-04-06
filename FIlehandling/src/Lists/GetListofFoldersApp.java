package Lists;
import java.io.*;
public class GetListofFoldersApp 
{
    public static void main(String[] args) 
    {
        // File f = new File("D:\\");`
        File f = new File("D:\\Core Java");
        File fw[] = f.listFiles();
        int i;
        System.out.println("List of all Folder inside above Path");
        for(i=0;i<fw.length;i++)
        {
            System.out.println(fw[i]);
        }
    }
}
