// --- CIRCLE MODULE ---

class Circle {
    public int radius;

    // Constructor
    Circle(int r) {
        System.out.println("-> Circle initialized with radius: " + r);
        this.radius = r;
    }

    // Area calculate method
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
}

// Cylinder extend (inherit) class Circle 
class Cylinder extends Circle {
    public int height;

    // Constructor
    Cylinder(int r, int h) {
        super(r); // Call Parent class (Circle) constructor
        System.out.println("-> Cylinder initialized with height: " + h);
        this.height = h;
    }

    // Calculate  volume method
    public double calculateVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}


// --- RECTANGLE MODULE ---
class Rectangle {
    public int length;
    public int breadth;

    // Constructor
    Rectangle(int l, int b) {
        System.out.println("-> Rectangle initialized (Length: " + l + ", Breadth: " + b + ")");
        this.length = l;   
        this.breadth = b;
    }

    // Area calculate  method
    public int calculateArea() {
        return this.length * this.breadth;
    }
}

// Cuboid class extend Rectangle 
class Cuboid extends Rectangle {
    public int height;

    // Constructor
    Cuboid(int l, int b, int h) {
        super(l, b); // Call constructor of Parent class (Rectangle) 
        System.out.println("-> Cuboid initialized with height: " + h);
        this.height = h;
    }

    // Method of Volume calculate  
    public double calculateVolume() {
        return this.length * this.breadth * this.height;
    }
}


// --- MAIN EXECUTION CLASS ---
public class GeometryDemo {
    public static void main(String[] args) {
        
        // ==========================================
        // SECTION 1: Circle & Cylinder Execution
        // ==========================================
        System.out.println("=== CIRCLE & CYLINDER OPERATIONS ===");
        
        Circle myCircle = new Circle(15);
        System.out.printf("Circle Area: %.2f\n\n", myCircle.calculateArea());

        Cylinder myCylinder = new Cylinder(25, 30);
        System.out.printf("Cylinder Volume: %.2f\n\n", myCylinder.calculateVolume());


        // ==========================================
        // SECTION 2: Rectangle & Cuboid Execution
        // ==========================================
        System.out.println("=== RECTANGLE & CUBOID OPERATIONS ===");
        
        Rectangle myRectangle = new Rectangle(25, 2);
        System.out.println("Rectangle Area: " + myRectangle.calculateArea() + "\n");

        Cuboid myCuboid = new Cuboid(25, 2, 2);
        System.out.println("Cuboid Volume: " + myCuboid.calculateVolume());
    }
}
