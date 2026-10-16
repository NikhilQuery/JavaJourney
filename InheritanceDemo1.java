class BaseClass {
    // Base Class Default Constructor
    BaseClass() {
        System.out.println("I am a base class constructor");
    }

    // Base Class Parameterized Constructor
    BaseClass(int x) {
        System.out.println("I am a base class constructor with x = " + x);
    }
}

class DerivedClass extends BaseClass {
    // Derived Class Default Constructor
    DerivedClass() {
        System.out.println("I am in derived class constructor");
    }

    // Derived Class Parameterized Constructor
    DerivedClass(int x, int y) {
        super(x); // Calling BaseClass parameterized constructor
        System.out.println("I am in derived class constructor where y = " + y);
    }
}

class GrandChildClass extends DerivedClass {
    // GrandChild Class Default Constructor
    GrandChildClass() {
        System.out.println("I am GrandChild default constructor");
    }

    // GrandChild Class Parameterized Constructor
    GrandChildClass(int x, int y, int z) {
        super(x, y); // Calling DerivedClass parameterized constructor 
        System.out.println("I am in grand child class constructor where z = " + z);
    }
}

public class InheritanceDemo1 {
    public static void main(String[] args) {
        System.out.println("--- Testing Multi-Level Constructor Chaining ---");
        
        // Making Object with Parameterized constructor  
        GrandChildClass child = new GrandChildClass(10, 20, 30);
    }    
}