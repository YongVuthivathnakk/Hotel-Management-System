package Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;


public class ReadFromFile {
    
    public static void reader(String fileName, ArrayList<String[]>wordsArray){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            String[] words;
            while ((line = reader.readLine()) != null) {
                words = line.split(",");
                wordsArray.add(words);
                
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
