import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class BufferedReaderwordOccurApp 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner xyz = new Scanner(System.in);
        FileWriter fw = new FileWriter("D:\\Core Java\\File Handling\\Data\\ABC.doc",false);
        BufferedWriter bw = new BufferedWriter(fw);
        LinkedHashMap<String,Integer> m = new LinkedHashMap<String,Integer>();
        Set<Map.Entry<String, Integer>> set = m.entrySet();    
        String data;
        System.out.println("Enter the Data inside File:");
        data = xyz.nextLine();
        String str [] = data.split(" ");
        int i,limit;
        for(i=0;i<data.length()&&i<str.length;i++)
        {
            String w = str[i];
            if(m.containsKey(w))
            {
                m.put(w, m.get(w)+1);
            }
            else
            {
                m.put(w, 1);
            }
        }
        System.out.println("Pepeated words with Occurrence are:");
        for(Map.Entry<String,Integer> m1 : set)
        {
            if(m1.getValue()>1)
            {
                System.out.println(m1.getKey() + "   " + m1.getValue());
            }
        }
        bw.write(data);
        bw.newLine();
        bw.close();
        System.out.println("Data Sved Successfully inside File....");
    }
}
