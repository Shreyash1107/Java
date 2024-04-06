package Lists;
import java.io.*;
import java.util.Scanner;
public class BufferedWriterApp 
{
    public static void main(String[] args) throws IOException 
    {
        FileWriter fw = new FileWriter("D:\\Core Java\\File Handling\\Data\\ABC.doc",true);   
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner xyz = new Scanner(System.in); 
        String data;
        System.out.println("Enter the Data inside File:");
        data = xyz.nextLine();
        bw.write(data);
        bw.newLine();
        bw.close();
        System.out.println("Data has benn Saved Succesfully.....");
    }
}
