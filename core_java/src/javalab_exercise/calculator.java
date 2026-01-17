package javalab_exercise;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
	
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of A : ");
		a=sc.nextInt();
		System.out.println("Enter the value of B : ");
		b=sc.nextInt();
		
		c=a+b;
		System.out.println("Addition of A & B is " + c);
		c=a-b;
		System.out.println("Subtraction of A & B is " + c);
		c=a*b;
		System.out.println("Multipliation of A & B is " + c);
	    c=a/b;
	    System.out.println("Division of A & B is " + c);
	    c=a%b;
		System.out.println("Module of A & B is " + c);
	}
	}


