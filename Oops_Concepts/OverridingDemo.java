package Oops_Concepts;
class A {
    public int c;

    public int getNumber() {
        return 4;
    }

    public void displayMessage() {
        System.out.println("I am a method of Class A");
    }
}

class B extends A {
    @Override 
    public void displayMessage() { // Method overridden successfully!
        System.out.println("I am a method of Class B");
    }

    public void uniqueChildMethod() {
        System.out.println("I am an exclusive method of Class B");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        System.out.println("--- Testing Method Overriding ---");
        
        A objA = new A();
        objA.displayMessage(); // Parent logic execute 
        
        B objB = new B();
        objB.displayMessage(); // Overridden child logic execute 
    }
}
