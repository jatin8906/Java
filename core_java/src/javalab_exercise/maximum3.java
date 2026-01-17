package javalab_exercise;
import java.util.*;
public class maximum3 {
	
	public static void maximumof3() {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter num 1 :");
		num1=sc.nextInt();
		System.out.println("Enter num 2 :");
		num2=sc.nextInt();
		System.out.println("Enter num 3 :");
		num3=sc.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				
				System.out.println("Number1 is Maximum :"+num1);
			}
			else {
				System.out.println("Number3 is Maximum :"+num3);
			}
			if(num2>num3) {
				System.out.println("Number 2 is Maximum :"+num2);
			}
		}
		else {
			System.out.println("Number 2 is Maximum :"+num2);
		}	
		
	}

	public static void main(String[] args) {

		maximumof3();
	}

}
