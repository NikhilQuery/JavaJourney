package Projects_and_Engines;

import java.util.Scanner;

interface trackable {
    void checkstockstatus();
}

class product implements trackable {
    private String productname;
    private int productid;
    private int currentstock;

    public product(String name, int id, int stock) {
        this.productname = name;
        this.productid = id;
        this.currentstock = stock;
    }

    public int getCurrentstock() {
        return currentstock;
    }

    public String getProductname() {
        return productname;
    }

    @Override
    public void checkstockstatus() {
        System.out.println("Product: " + productname + " | Stock: " + currentstock);
    }
}

class perishableproduct extends product {
    private int daystoexpiry;

    public perishableproduct(String name, int id, int stock, int expiryDays) {
        super(name, id, stock); 
        this.daystoexpiry = expiryDays;
    }

    @Override
    public void checkstockstatus() {
        System.out.println("\nChecking Status for: " + getProductname());
        System.out.println("Current Stock: " + getCurrentstock() + " | Days to Expiry: " + daystoexpiry);
        
        if (getCurrentstock() < 10 || daystoexpiry <= 2) {
            System.out.println("ALERT: Restock Immediately or item will expire!");
        } else {
            System.out.println("Stock Status: Safe");
        }
    }
}

public class WareHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Warehouse Inventory Management ===");
        
        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product ID: ");
        String inputIdStr = sc.next();
        int id = Integer.parseInt(inputIdStr);

        System.out.print("Enter Current Stock Quantity: ");
        String inputStockStr = sc.next();
        int stock = Integer.parseInt(inputStockStr);

        System.out.print("Enter Days to Expiry: ");
        String inputExpiryStr = sc.next();
        int expiryDays = Integer.parseInt(inputExpiryStr);

        perishableproduct prod = new perishableproduct(name, id, stock, expiryDays);
        prod.checkstockstatus();

        sc.close();
    }
}
