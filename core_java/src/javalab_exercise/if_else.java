package javalab_exercise;
import java.util.Scanner;
public class if_else {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
       
		System.out.println("Enter the number :");
		n=sc.nextInt();
		
		if (n % 2 == 0) {
			
			System.out.println("Even Number :"+n);
		}
		else {
			System.out.println("You have entered odd number :"+n);
		}
		

	}

}
