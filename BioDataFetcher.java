import java.util.Scanner;
public class BioDataFetcher {
    public static void main(String[] args) {
        System.out.println("User Bio-Data Fetcher");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter college name");
        String college = sc.nextLine();
        System.out.println("\nHey " + name + "," + "you are " + age + " years old and you study at " + college + ".");
        System.out.print("Welcome Aboard!");
        sc.close();
     }  
}
