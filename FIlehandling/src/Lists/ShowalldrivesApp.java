package Lists;
import java.io.*;
public class ShowalldrivesApp 
{
    public static void main(String[] args) 
    {
        File F[] = File.listRoots();
        int i;
        System.out.println("Name of all Drives:");
        for(i=0;i<F.length;i++)
        {
            System.out.println(F[i]);
        }
    }
}
