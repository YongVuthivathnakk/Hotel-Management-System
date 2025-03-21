package Data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;



public class WriteToFile {

    
    public static <K,V> void writer (String fileName, HashMap<K, V> data){
        try {
            BufferedWriter roomWriter = new BufferedWriter(new FileWriter(fileName, true));
            for (HashMap.Entry<K, V> entry : data.entrySet()) {
                roomWriter.write(entry.getValue().toString());
                roomWriter.newLine();
            }     
            roomWriter.close();
        } catch (IOException e) {
            System.out.println("An IO Exception occured: " + e.getMessage());
            e.printStackTrace();
        }
    }
}