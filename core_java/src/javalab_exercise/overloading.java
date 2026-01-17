package javalab_exercise;

public class overloading {
	

	    
	    void display(int a, int b) {
	        System.out.println("Sum of integers: " + (a + b));
	    }

	  
	    void display(double a, double b) {
	        System.out.println("Sum of doubles: " + (a + b));
	    }

	    void display(String msg) {
	        System.out.println("Message: " + msg);
	    }

	    public static void main(String[] args) {
	        overloading obj = new overloading();

	        obj.display(10, 20);          // Calls int version
	        obj.display(10.5, 20.5);      // Calls double version
	        obj.display("Hello Java");    // Calls String version
	    }
	}

	

