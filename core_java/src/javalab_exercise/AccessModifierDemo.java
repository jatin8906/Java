package javalab_exercise;

class AccessDemo {

    
    public int a = 10;
    protected int b = 20;
    int c = 30;         
    private int d = 40;

    
    public void publicMethod() {
        System.out.println("Public Method: a = " + a);
    }

    protected void protectedMethod() {
        System.out.println("Protected Method: b = " + b);
    }

    void defaultMethod() {
        System.out.println("Default Method: c = " + c);
    }

    private void privateMethod() {
        System.out.println("Private Method: d = " + d);
    }

    
    void showPrivate() {
        privateMethod();
    }
}

// Child class in the same 
public class AccessModifierDemo extends AccessDemo {

    public static void main(String[] args) {
        AccessModifierDemo obj = new AccessModifierDemo();

        
        System.out.println("Public variable: " + obj.a);
        System.out.println("Protected variable: " + obj.b);
        System.out.println("Default variable: " + obj.c);
        // System.out.println(obj.d); // ❌ private not accessible

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
      // private method is not accessible in other class

        // Accessing private member through public method
        obj.showPrivate();
    }
}
