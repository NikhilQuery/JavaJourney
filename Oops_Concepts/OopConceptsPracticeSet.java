package Oops_Concepts;

// --- Part 1: Abstract Pen Implementation ---
abstract class Pen {
    abstract void write();
    abstract void refill();    
}

class FountainPen extends Pen { 
    @Override
    void write() {
        System.out.println("Fountain Pen is writing...");
    } 
    
    @Override
    void refill() {
        System.out.println("Refilling the Fountain Pen reservoir.");
    }
    
    // Unique method of FountainPen class
    void changeNib() {
        System.out.println("Changing the damaged pen nib.");
    }
}

// --- Part 2: Multilevel Behavior (Inheritance + Interface) ---
class Monkey {
    public void jump() {
        System.out.println("Monkey is jumping around trees!");
    }
    public void bite() {
        System.out.println("Careful! Monkey can bite.");
    }
}

interface BasicAnimal {
    void eat();
    void sleep();
}

// Human inherits physical traits of Monkey and rules of BasicAnimal
class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello Sir! Welcome to the system.");
    }
    
    @Override 
    public void eat() {
        System.out.println("Human is eating cooked food.");
    }
    
    @Override 
    public void sleep() {
        System.out.println("Human is sleeping for 8 hours.");
    }
}

// Main class execution
public class OopConceptsPracticeSet {
    public static void main(String[] args) {
        System.out.println("=== Testing Fountain Pen ===");
        FountainPen myPen = new FountainPen();
        myPen.write();
        myPen.refill();
        myPen.changeNib();
        
        System.out.println("\n=== Testing Human Class ===");
        Human humanObj = new Human();
        humanObj.speak();
        humanObj.sleep();
        humanObj.eat();

        System.out.println("\n=== Testing Dynamic Method Dispatch (Monkey Reference) ===");
        // Monkey reference can only access Monkey methods even if object is Human
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        
        System.out.println("\n=== Testing Polymorphism (BasicAnimal Reference) ===");
        // Interface reference can only call interface abstract methods
        BasicAnimal nikhil = new Human();
        nikhil.sleep();
        nikhil.eat();
        // nikhil.speak(); // ERROR: speak() is undefined for the interface type BasicAnimal
    }
}
