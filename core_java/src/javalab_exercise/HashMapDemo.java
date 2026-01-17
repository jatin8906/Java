package javalab_exercise;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

      
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Amit");
        students.put(102, "Neha");
        students.put(103, "Rahul");

       
        System.out.println("HashMap contents:");
        System.out.println(students);

        int key = 102;
        System.out.println("\nValue for key " + key + ": " + students.get(key));


        System.out.println("\nContains key 101? " + students.containsKey(101));
        System.out.println("\nIterating through HashMap:");
        for (Integer k : students.keySet()) {
            System.out.println("Key: " + k + ", Value: " + students.get(k));
        }
    }
}
