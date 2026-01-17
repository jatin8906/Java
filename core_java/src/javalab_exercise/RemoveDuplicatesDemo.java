package javalab_exercise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesDemo {
    public static void main(String[] args) {

        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List:");
        System.out.println(numbers);

        
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        
        List<Integer> resultList = new ArrayList<>(uniqueNumbers);

        System.out.println("\nList after removing duplicates:");
        System.out.println(resultList);
    }
}
