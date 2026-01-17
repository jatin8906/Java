package javalab_exercise;

import java.util.Scanner;
public class fibonaaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,first=0,second=1,temp = 0;
		System.out.println("Enter the Nth term you Want to print : ");
		n=sc.nextInt();
		for(int i = 0 ; i<=n ; i++ ) {
			
			System.out.println(first+" ");
			temp = first + second;
			first=second;
			second = temp;
			
			
			
		}
		
		
		
	}

}
