package javalab_exercise;

class Shape {
 void draw() {
     System.out.println("Drawing a shape");
 }
}


class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }
}


class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a rectangle");
 }
}

//Main class
public class MethodOverridingDemo {
 public static void main(String[] args) {

   
     Shape s;

     s = new Circle();
     s.draw();   

     s = new Rectangle();
     s.draw();  
 }
}


