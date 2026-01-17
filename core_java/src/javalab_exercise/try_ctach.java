package javalab_exercise;
import java.util.*;
public class try_ctach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c ;
		System.out.println("Enter two Numbers :");
		a = sc.nextInt();
		b= sc.nextInt();
		
		try {
			
			c = a/b;
			
		}catch(Exception e ) {
			System.out.println(e);	}
		
		
		
		
	}

}
