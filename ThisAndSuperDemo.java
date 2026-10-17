class ParentClass {
    int a;

    // Constructor setting value using 'this' keyword
    ParentClass(int v) {
        this.a = v; // 'this' point current object variable 
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }
}

class ChildClass extends ParentClass {
    // Constructor invoking parent constructor using 'super' keyword
    ChildClass(int c) {
        super(c); // 'super' call the parent class constructor
        System.out.println("I am a ChildClass Constructor");
    }
}

public class ThisAndSuperDemo {
    public static void main(String[] args) {
        System.out.println("--- Testing This and Super Keywords ---");
        
        ParentClass parentObj = new ParentClass(15);
        ChildClass childObj = new ChildClass(19);
        
        System.out.println("Value of a in parentObj: " + parentObj.getA());
        System.out.println("Value of a in childObj: " + childObj.getA());
    }
}
