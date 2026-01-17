package javalab_exercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
    public static void main(String[] args) {

        
        String fileName = "sample.txt";

       
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello World!\n");
            writer.write("This is a FileWriter example.\n");
            writer.write("Java File I/O demonstration.");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e);
        }

    
        try {
            FileReader reader = new FileReader(fileName);
            int ch;
            System.out.println("\nReading data from file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading: " + e);
        }
    }
}
