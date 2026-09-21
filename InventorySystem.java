import java.util.Scanner;
public class InventorySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" === Welcome to E-Commerce Order Management System === ");
        String mainproduct="laptop";
        int totalstock=10;
        int value=50000;
        int totalrevenue=0;
        int attemp=0;
        while(true){
            System.out.println("OPTIONS ARE HERE ");
            System.out.println("1.VIEW DETAILS");
            System.out.println("2.PLACE CUSTOMER ORDER");
            System.out.println("3.RESTCOK PRODUCT");
            System.out.println("4.EXIT");
            System.out.println("ENTER YOUR CHOICE");
            int choice=sc.nextInt();
            if (choice==1){
                System.out.println("ITEM NAME = " + mainproduct);
                System.out.println("STOCK OF ITEM = " + totalstock);
                System.out.println("VALUE OF ITEM IS = " + value);
                System.out.println("TOTAL REVENUE IS = " + totalrevenue);
            }
            else if (choice==2){
                System.out.println("ENTER STOCK");
                int stock =sc.nextInt();
                if (stock<=totalstock){
                    System.out.println(" your order has been accepted");
                    totalstock=totalstock-stock;
                    totalrevenue=totalrevenue +(value*stock);
                }
                else {
                    attemp++;
                    System.out.println("please enter less than 10");
                    if(attemp>3){
                        System.out.println("sorry your attemps are complete");
                        return;
                    }
                }
            }
            else if(choice==3){
                System.out.println("ENTER RESTOCK VALUE");
                int restock=sc.nextInt();
                if(restock<=0){
                    System.out.println("please enter specified value");
                }
                else{
                    totalstock=totalstock+restock;
                    System.out.println(restock + " has been added to stock" );
                }
            }
            else if (choice==4){
                System.out.println("------FINAL SUMMARY------");
                System.out.println("TOTAL STOCK = " + totalstock);
                System.out.println("TOTAL REVENUE GRANTED = " + totalrevenue);
                break;
            }
            else{
                System.out.println("Invalid Choice! Please select between 1-4.");
            }
        }
        sc.close();
    }
}