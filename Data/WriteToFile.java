package Data;

// import java.io.BufferedWriter;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.HashMap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;


public class WriteToFile {
    public static void main(String[] args) {
        connect();
        closeConnection();
    }





































    // // In Java, generics allow you to create classes, interfaces, and methods that can operate on different data types
    // // while ensuring type safety at compile time.
    // public static <K,V> void writer (String fileName, HashMap<K, V> data){
    //     try {
    //         BufferedWriter roomWriter = new BufferedWriter(new FileWriter(fileName, true));
    //         for (HashMap.Entry<K, V> entry : data.entrySet()) {
    //             roomWriter.write(entry.getValue().toString());
    //             roomWriter.newLine();
    //         }     
    //         roomWriter.close();
    //     } catch (IOException e) {
    //         System.out.println("An IO Exception occured: " + e.getMessage());
    //         e.printStackTrace();
    //     }
    // }





}