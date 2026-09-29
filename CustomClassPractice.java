class Employee {
    int id;
    String name;
    int salary;

    // Method to print object properties
    public void printDetails() {
        System.out.println("My ID is " + id);
        System.out.println("My name is " + name);
        System.out.println("Salary is " + salary);
    }


}

public class CustomClassPractice {
    public static void main(String[] args) {
         System.out.println("--- This is our Custom OOPs Program ---");
         
         // Instantiating objects 
         Employee nikhil = new Employee();
         Employee niku = new Employee();
         
         // Setting attributes for object 1
         nikhil.id = 12;
         nikhil.name = "Kli";
         nikhil.salary = 100000; // Realistic salary value
         
         // Setting attributes for object 2
         niku.id = 13;
         niku.name = "John";
         niku.salary = 120000;  // Realistic salary value
         
         // Invoking methods on objects
         nikhil.printDetails();
         niku.printDetails();
    }
}
         
         
         