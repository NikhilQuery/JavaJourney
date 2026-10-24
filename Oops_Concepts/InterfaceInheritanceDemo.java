package Oops_Concepts;

// Base Interface
interface SampleInterface {
    void meth1();
    void meth2();
}

// Child Interface inheriting properties of SampleInterface
interface ChildSampleInterface extends SampleInterface {
    void meth3();
    void meth4();
}

// Concrete class implementing the deepest child interface
// It is mandatory to implement ALL 4 methods here
class MySampleClass implements ChildSampleInterface {
    @Override
    public void meth1() {
        System.out.println("Executing Method 1");
    }

    @Override
    public void meth2() {
        System.out.println("Executing Method 2");
    }

    @Override
    public void meth3() {
        System.out.println("Executing Method 3");
    }

    @Override
    public void meth4() {
        System.out.println("Executing Method 4");
    }
}

// Main class execution
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        // Creating object of the concrete class
        MySampleClass obj = new MySampleClass();
        
        // Calling all available methods
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
