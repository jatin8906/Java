package javalab_exercise;

import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);

            
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;   
            System.out.println("Result: " + result);

            int[] arr = {10, 20, 30};
            System.out.println("Array element: " + arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");

        } catch (Exception e) {
            System.out.println("General Exception occurred");
        }

        System.out.println("Program continues normally...");
    }
}
