package javalab_exercise;


abstract class Shape1 {
 abstract void draw();

 void display() {
     System.out.println("This is a shape");
 }
}


class Circle1 extends Shape1 {
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

public class AbstractClassDemo {
 public static void main(String[] args) {
     Shape1 s = new Circle1();
     s.display();
     s.draw();
 }
}
