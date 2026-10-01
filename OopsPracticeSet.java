import java.util.Scanner;

class TommyVecetti {
    public void hit() { System.out.println("Hitting... "); }
    public void running() { System.out.println("Running... "); }
    public void firing() { System.out.println("Firing... "); }
}

class Rectangle {
    int length; int breadth;
    public int area() { return length * breadth; }
    public int perimeter() { return 2 * (length + breadth); }
}

class Square {
    int side;
    public int area() { return side * side; }
    public int perimeter() { return 4 * side; }
}

class Cellphone {
    public void ringing() { System.out.println("Ringing... "); }
    public void vibrate() { System.out.println("Vibrating... "); }
}

class MyEmployee {
    int salary; String name;
    public String getName() { return name; }
    public int getSalary() { return salary; }
    
}
    
    public class OopsPracticeSet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PROBLEM 1 ===");
        MyEmployee nikhil = new MyEmployee();
        System.out.println("Enter Employee Name");
        nikhil.name = sc.nextLine();
        System.out.println("Enter Salary in $ " );
        nikhil.salary = sc.nextInt();
        System.out.println("Employee Name = " + nikhil.name);
        System.out.println("Employee Salary = $" + nikhil.salary);

        System.out.println("\n=== PROBLEM 2 ===");
        System.out.println("Cell Phone Method");
        Cellphone apple = new Cellphone();
        apple.ringing();
        apple.vibrate();

        System.out.println("\n=== PROBLEM 3 ===");
        System.out.println("Find Area and Perimeter of Square ");
        Square sq = new Square();
        System.out.println("Enter Side of Square");
        sq.side =sc.nextInt();
        System.out.println("Square Area: " + sq.area());
        System.out.println("Square Perimeter: " + sq.perimeter());

        System.out.println("\n=== PROBLEM 4 ===");
        System.out.println("Find Area and Perimeter of Rectangle ");
        Rectangle rec = new Rectangle();
        System.out.println("Enter Length");
        rec.length = sc.nextInt(); 
        System.out.println("Enter Breadth");
        rec.breadth = sc.nextInt();
        System.out.println("Rectangle Area: " + rec.area());
        System.out.println("Rectangle Perimeter: " + rec.perimeter());

        System.out.println("\n=== PROBLEM 5 ===");
        TommyVecetti tommy = new TommyVecetti();
        System.out.println("Tommy Vecetti is ");
        tommy.hit();
        tommy.running();
        tommy.firing();
    sc.close();
    }
}