package Lists;
import java.io.*;
public class CheckfileApp 
{
    public static void main(String[] args) 
    {
        File f = new File("D:\\");
        File list[] = f.listFiles();
        int i;
        for(i=0;i<list.length;i++)
        {
            if(list[i].isDirectory())
            {
                System.out.println(list[i]);
            }  //Checking whether Specified Path contains Folder or not 
        }
    }
}
