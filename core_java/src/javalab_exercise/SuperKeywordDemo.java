package javalab_exercise;


class Person {
 String name;


 Person(String name) {
     this.name = name;
     System.out.println("Parent class constructor called");
 }

 void display() {
     System.out.println("Name from Parent class: " + name);
 }
}

class Student1 extends Person {
 int rollNo;

 
 Student1(String name, int rollNo) {
     
     super(name);
     this.rollNo = rollNo;
     System.out.println("Child class constructor called");
 }


 void showDetails() {
     
     super.display();
     System.out.println("Roll Number from Child class: " + rollNo);
 }
}

public class SuperKeywordDemo {
 public static void main(String[] args) {
     Student1 s = new Student1("Jatin", 101);
     s.showDetails();
 }
}
