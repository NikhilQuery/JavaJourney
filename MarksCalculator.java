import java.util.Scanner;
public class MarksCalculator {
    public static void main(String[] args) {
        System.out.println("BOARD EXAM");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first subject marks: ");
        double mark1 = sc.nextDouble();
        if (mark1 > 100 || mark1 < 0) {
            System.out.println("Error:Marks must be between 0 and 100.Please start program again");
            sc.close();
            return; 
        }
        System.out.print("enter second subject marks: ");
        double mark2 = sc.nextDouble();
        if (mark2 > 100 || mark2 < 0) {
            System.out.println("Error: Invalid Marks! Marks must be between 0 and 100.Please start program again");
            sc.close();
            return; 
        }
        System.out.print("enter third subject marks: ");
        double mark3 = sc.nextDouble();
        if (mark3 > 100 || mark3 < 0) {
            System.out.println("Error: Invalid Marks! Marks must be between 0 and 100.Please start program again");
            sc.close();
            return; 
        }
        System.out.print("enter fourth subject marks: ");
        double mark4 = sc.nextDouble();
        if (mark4 > 100 || mark4 < 0) {
            System.out.println("Error: Invalid Marks! Marks must be between 0 and 100.Please start program again");
            sc.close();
            return; 
        }
        System.out.print("enter fifth subject marks: ");
        double mark5 = sc.nextDouble();
        if (mark5 > 100 || mark5 < 0) {
            System.out.println("Error: Invalid Marks! Marks must be between 0 and 100.Please start program again");
            sc.close();
            return; 
        }
        double totalobtained = mark1 + mark2 + mark3 + mark4 + mark5 ;
        double totalmarks = 500.0;
        double percentage = (totalobtained / totalmarks) * 100;
        System.out.println("\n---Result---");
        System.out.println("total marks scored: " + totalobtained + "/" + (int)totalmarks );
        System.out.println("total percentage: " + percentage + " %" );
        sc.close();
    }
}