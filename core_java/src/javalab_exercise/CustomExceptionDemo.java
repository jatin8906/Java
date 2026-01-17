package javalab_exercise;

import java.util.Scanner;
class InvalidAgeException extends Exception {

    // Constructor
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    // Method that throws custom exception
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        } else {
            System.out.println("Valid age. Access granted.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        sc.close();
    }
}

