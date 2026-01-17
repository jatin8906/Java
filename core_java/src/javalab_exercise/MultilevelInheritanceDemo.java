// Base class
package javalab_exercise;
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

// Derived class (Level 1)
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

// Derived class (Level 2)
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();

        
        ec.start();   
        ec.drive();  
        ec.charge();   
    }
}


