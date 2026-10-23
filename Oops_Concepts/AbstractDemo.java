package Oops_Concepts;
// 1. Abstract Base Class
abstract class Parent2 {
    
    // Constructor: This runs automatically whenever a child class object is created
    public Parent2() {
        System.out.println("I am a base 2 constructor (Parent2 Constructor Called)");
    }
    
    // Regular Method: This has a complete body and can be directly used by child classes
    public void sayHello() {
        System.out.println("Hello");
    }
    
    // Abstract Methods: These have no body (definition) here. 
    // Any concrete (non-abstract) subclass extending this class MUST override and implement them.
    abstract public void greet();
    abstract public void greet2();
}

// 2. Concrete Subclass (Normal Child Class)
// This class inherits from Parent2 and must implement all its abstract methods.
class Child2 extends Parent2 {
    
    // Overriding the abstract greet() method to provide specific logic
    @Override 
    public void greet() {
        System.out.println("Good morning");
    }
    
    // Overriding the abstract greet2() method
    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

// 3. Abstract Subclass
// Because this class is also declared 'abstract', it is NOT forced to implement 
// the abstract methods of Parent2. Note: You cannot instantiate (create an object of) this class.
abstract class Child3 extends Parent2 {
    
    // Regular method unique to Child3
    public void th() {
        System.out.println("I am good");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        
        System.out.println("--- Creating Object of Child2 ---");
        
        // Instantiating Child2. 
        // This will implicitly call the Parent2 constructor first, then initialize Child2.
        Child2 c = new Child2();
        
        System.out.println("\n--- Calling Methods ---");
        
        // Calling the regular method inherited from Parent2
        c.sayHello(); 
        
        // Calling the implemented abstract methods
        c.greet();   
        c.greet2();  

        /* 
         * IMPORTANT NOTE ON ABSTRACTION:
         * You cannot instantiate abstract classes directly. 
         * The lines below would throw a compilation error if uncommented:
         * 
         * Parent2 p = new Parent2(); // ERROR!
         * Child3 c3 = new Child3();  // ERROR!
         */
    }
}