import java.util.Scanner;
public class AtmEngine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctpasswd="kli";
        int corectpin =1234;
        int balance = 10000;
        int attemp =0;
        while (true) {
            System.out.print("enter Username = ");
            String Username =sc.nextLine();
            System.out.print("Enter Pin = ");
            int Pin =sc.nextInt();
            if (Pin == corectpin && Username.equals(correctpasswd)){
                System.out.println("correct Username and Pin");
                break;
            } else{
                attemp++;
                System.out.println("wrong Username Or Pin");
            }   
            if (attemp == 3){
                System.out.println("Sorry Your Attemps Complete");
                System.out.println("END");
                return;
            }
        }
        while(true){
            System.out.println();
            System.out.println("Options Are Here ");
            System.out.println("1.Check Balance");
            System.out.println("2. Add Amount");
            System.out.println("3.Withdraw Amount");
            System.out.println("4.Exit");
            System.out.println("Enter Your Choice");
            int choice = sc.nextInt();
            if (choice==1){
                System.out.println("Your Account Balance Is = $" + balance);
            }
            else if (choice==2){
                System.out.print("Enter Your Adding Amount = $" );
                int addamount=sc.nextInt();
                if (addamount>0){
                    System.out.print("Now Your Account Balance Is = $");
                    System.out.println();
                    System.out.println(balance = balance + addamount);
                }                   
            }
            else if (choice==3){
                System.out.print("Enter Your Withdraw Amount = $" );
                int amount=sc.nextInt();
                if (amount>balance){
                    System.out.println("Insufficient Balance");
                    continue;
                }
                System.out.print("Now Your Account Balance Is = $");
                System.out.println(balance= balance - amount);
            }
            else if(choice==4){
                break;
            }           
        } 
        sc.close();
    }
}
