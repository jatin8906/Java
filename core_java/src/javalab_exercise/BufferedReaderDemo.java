package javalab_exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        String fileName = "sample.txt";

        try {
           
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("Reading file line by line:\n");

         
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

           
            
       
            br.close();

        } catch (IOException e) {
            System.out.println("Error while reading file: " + e);
        }
    }
}
