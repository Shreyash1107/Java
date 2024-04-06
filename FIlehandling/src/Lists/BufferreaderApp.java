import java.util.*;
import java.io.*;
public class BufferreaderApp 
{
    public static void main(String[] args) throws IOException 
      {
         FileReader fr = new FileReader("D:\\Core Java\\File Handling\\Data\\ABC.doc");
        BufferedReader br = new BufferedReader(fr);

         String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n"); // Append each line to StringBuilder
        }
        br.close(); // Close the BufferedReader

          String data = sb.toString(); // Convert StringBuilder to String
        System.out.println("File content:\n" + data);

        LinkedHashMap<String, Integer> wordOccurrences = new LinkedHashMap<String,Integer>();
        String[] words = data.split(" "); // Split by whitespace

            for (String word : words) {
            if (!word.isEmpty()) 
             { 
                wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
            }
        }

               System.out.println("Repeated words and their occurrences:");
        Set<Map.Entry<String, Integer>> entrySet = wordOccurrences.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
