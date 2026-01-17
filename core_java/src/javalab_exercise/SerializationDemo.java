package javalab_exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationDemo {
    public static void main(String[] args) {

        String fileName = "student.ser";

        // Serialization
        try {
            Student s1 = new Student(101, "Rahul", 85.5);

            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Serialization error: " + e);
        }

       
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("\nObject deserialized successfully:");
            s2.display();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e);
        }
    }
}
