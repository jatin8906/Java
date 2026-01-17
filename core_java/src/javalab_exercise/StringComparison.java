package javalab_exercise;
import java.util.*;
public class StringComparison {
   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine();

	      
	        if (str1.equals(str2)) {
	            System.out.println("Using equals(): Strings are equal");
	        } else {
	            System.out.println("Using equals(): Strings are NOT equal");
	        }

	        
	        int result = str1.compareTo(str2);

	        if (result == 0) {
	            System.out.println("Using compareTo(): Strings are equal");
	        } else if (result < 0) {
	            System.out.println("Using compareTo(): First string is smaller");
	        } else {
	            System.out.println("Using compareTo(): First string is greater");
	        }

	        
	    }
	}


