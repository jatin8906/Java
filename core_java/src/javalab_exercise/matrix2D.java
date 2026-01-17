package javalab_exercise;
import java.util.Scanner;

public class matrix2D {

	public static void main(String[] args) {
		
		int[][] matrix1 = new int[2][2];
		int[][] matrix2 = new int[2][2];
		int[][] sum = new int[2][2];
		int i,j;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the elements of First Matrix : ");

		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				
				matrix1[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("Enter the elements of Second Matrix : ");

		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				
				matrix2[i][j] = sc.nextInt();
				
			}
		}
		
	
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				
				sum[i][j]=matrix1[i][j] + matrix2[i][j];
				
			}
		}
		
		System.out.println("Matrix Sum");
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println( );
		}
		
		
		
		

	}

}
