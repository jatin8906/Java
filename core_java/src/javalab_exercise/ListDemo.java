package javalab_exercise;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

       
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

      
        arrayList.remove("Banana");

        System.out.println("\nArrayList after removal:");
        System.out.println(arrayList);

  
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("Cat");
        linkedList.add("Dog");
        linkedList.add("Elephant");

        System.out.println("\nLinkedList elements:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }

       
        linkedList.addFirst("Lion");
        linkedList.addLast("Tiger");

        System.out.println("\nLinkedList after adding first and last:");
        System.out.println(linkedList);

    
        linkedList.removeFirst();

        System.out.println("\nLinkedList after removing first:");
        System.out.println(linkedList);
    }
}
