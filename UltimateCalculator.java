import java.util.Scanner;
public class  UltimateCalculator {
    public static void welcomemessage(){
        System.out.println("=== WELCOME TO THE ULTIMATE CALCULATOR ===");
        System.out.println("Powered by Static, Overloaded, VarArgs & Recursive Methods!");
    }
    public int add(int a, int b){
        return a + b;
    }
    public double add(double da, double db){
        return da + db;
    }
    public  int addmultiple(int... numbers){
        int sum = 0;
        for(int num:numbers){
            sum+= num;
        }
        return sum;
    }
    public int calculatefactorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n *calculatefactorial(n-1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         UltimateCalculator calc = new  UltimateCalculator();

        welcomemessage();

        System.out.println("\n--- Choose an Operation ---");
        System.out.println("1. Add 2 Integers ");
        System.out.println("2. Add 2 Decimals/Doubles ");
        System.out.println("3. Add Multiple Numbers ");
        System.out.println("4. Find Factorial of a Number ");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter integer a");
                int a=sc.nextInt();
                System.out.println("enter integer b");
                int b=sc.nextInt();
                System.out.println("Result (Integer Add): " + calc.add(a, b));
                break;            
                
                case 2:
                System.out.println("enter decimal a");
                double da=sc.nextDouble();
                System.out.println("enter decimal b");
                double db=sc.nextDouble();
                System.out.println("Result (decimal Add): " + calc.add(da, db));
                break;
                case 3:
                System.out.println("How many numbers do you want to add?");
                int count =sc.nextInt();
                int [] numarr = new int[count];
                for (int i=0; i< count; i++){
                    System.out.println("Enter number"  + (i + 1) + ":" );
                    numarr[i] = sc.nextInt();
                }
                System.out.println("Result (VarArgs Sum): " + calc.addmultiple(numarr));
                break;
                
                case 4:
                System.out.println("Enter a positive number for Factorial:");
                int factorial =sc.nextInt();
                if (factorial < 0){
                    System.out.println("Error: Negative numbers not allowed.");
                }
                else{
                    System.out.println("Result (" + factorial + "!): " + calc.calculatefactorial(factorial));
                }
                break;
                default:
                System.out.println("Invalid option selected!");
            }
            sc.close();
        }    
}
