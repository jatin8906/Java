package javalab_exercise;

public class constructor_demo {
	
	
	int age;
	String name;
	double percentage;

	public constructor_demo(int age, String name, double percentage) {
		
		this.age = age;
		this.name = name;
		this.percentage = percentage;
	}
	
	void display() {
		
		
		System.out.println("Age :"+age);
		System.out.println("Name  :"+name);
		System.out.println("Percentage :"+percentage);
	}


	public static void main(String[] args) {
		
		constructor_demo d1 = new constructor_demo(18, "jatin", 85.67);
		d1.display();

	}

}
