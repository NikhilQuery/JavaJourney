import java.util.Scanner;
public class SmartCalculator {
    // conditional logic
    int conditionalLogic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // simple addition logic
    int simpleAddition(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartCalculator calc = new SmartCalculator(); 

        System.out.println("--- WELCOME TO SMART CALCULATOR ---");
        System.out.println("Chunniye aapko kya karna hai:");
        System.out.println("1. Simple Addition (A + B)");
        System.out.println("2. Smart Conditional Logic (Agar A > B toh plus, nahi toh (A+B)*5)");
        System.out.print("Apna option select karein (1 ya 2): ");
        int choice = sc.nextInt();

        
        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();
        
        int result = 0;

        if (choice == 1) {
            result = calc.simpleAddition(a, b);
            System.out.println("Simple Addition answer is: " + result);
        } else if (choice == 2) {
            result = calc.conditionalLogic(a, b);
            System.out.println("Smart Logic answer is: " + result);
        } else {
            System.out.println("Wrong option! please select 1 or 2");
        }

        sc.close();
    }
}

