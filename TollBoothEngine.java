import java.util.Scanner;
public class  TollBoothEngine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" === The Automated Toll Booth Engine === ");
        int totalvehicles = 0;
        int totaltoll = 0;
        int vipcount = 0;
        while (true) {
            System.out.println("--- TOLL LANE MENU ---");
            System.out.println("1. Car ($50)");
            System.out.println("2. Truck ($100)");
            System.out.println("3. VIP Vehicle ($0 - Free Entry)");
            System.out.println("4. Close Booth & Generate Final Report");

            System.out.println("enter your choice: ");
            int choice =sc.nextInt();
            if (choice==1){
                System.out.println("YOUR TOLL HAS BEEN CUT");
                System.out.println(totaltoll=totaltoll+50);
                System.out.println(totalvehicles=totalvehicles+1);
            }
            else if (choice==2){
                System.out.println("YOUR TOLL HAS BEEN CUT");
                System.out.println(totaltoll=totaltoll+100);
                System.out.println(totalvehicles=totalvehicles+1);
            }
            else if (choice==3){
                System.out.println("YOUR TOLL HAS NOT BEEN CUT");
                System.out.println(vipcount=vipcount+1);
                System.out.println(totalvehicles=totalvehicles+1);
            }
            else if(choice==4){
                System.out.println("\n======================================");
                System.out.println("        FINAL SHIFT REPORT         ");
                System.out.println("======================================");
                System.out.println("TOTAL VEHICLES PASSED : " + totalvehicles);
                System.out.println("TOTAL TOLL COLLECTED  : $" + totaltoll);
                System.out.println("TOTAL VIP VEHICLES    : " + vipcount);
                System.out.println("======================================");
                break;
            }
            else{
                System.out.println("Alert: Lane Breach or Invalid Vehicle Type! Re-opening lane...");
                continue;
            }
        }
        sc.close();
    }
}