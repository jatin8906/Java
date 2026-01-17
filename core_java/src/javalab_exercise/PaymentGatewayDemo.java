package javalab_exercise;
interface PaymentGateway {
 void processPayment(double amount);
}

class CreditCardPayment implements PaymentGateway {
 public void processPayment(double amount) {
     System.out.println("Processing Credit Card payment of ₹" + amount);
 }
}

class UPIPayment implements PaymentGateway {
 public void processPayment(double amount) {
     System.out.println("Processing UPI payment of ₹" + amount);
 }
}

public class PaymentGatewayDemo {
 public static void main(String[] args) {
     PaymentGateway payment1 = new CreditCardPayment();
     payment1.processPayment(2500);

     PaymentGateway payment2 = new UPIPayment();
     payment2.processPayment(1500);
 }
}
