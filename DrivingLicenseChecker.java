import java.util.Scanner;

public class DrivingLicenseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for Driving License!");
        } else {
            System.out.println("Not eligible yet!");
        }
        sc.close();
    }
}

