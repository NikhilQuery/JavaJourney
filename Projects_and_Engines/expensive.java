package Projects_and_Engines;

import java.util.Scanner;

class Expense {
    private double amount;
    private String category;
    private String description;

    public Expense(double am, String cat, String des) {
        this.amount = am;
        this.category = cat;
        this.description = des;
    } 

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
}

class ExpenseManager {
    Expense[] expenses = new Expense[100];
    int expensecount = 0;

    public void addexpense(Expense e) {
        if (expensecount < 100) {
            expenses[expensecount] = e;
            expensecount++;
            System.out.println("Expense added successfully!");
        } else {
            System.out.println("Storage full! Cannot add more expenses.");
        }
    }

    public void viewExpenses() {
        if (expensecount == 0) {
            System.out.println("No expenses added yet.");
            return;
        }
        
        double total = 0;
        System.out.println("\n--- Your Expense List ---");
        for (int i = 0; i < expensecount; i++) {
            System.out.println((i + 1) + ". Amount: $" + expenses[i].getAmount() + 
                               " | Category: " + expenses[i].getCategory() + 
                               " | Description: " + expenses[i].getDescription());
            total += expenses[i].getAmount();
        }
        System.out.println("Total Expenses: $" + total);
    }

    public void splitBill(double amount, int friends) {
        if (friends <= 0) {
            System.out.println("Number of friends must be greater than 0.");
            return;
        }
        double share = amount / friends;
        System.out.println("\n--- Bill Split Summary ---");
        System.out.println("Total Bill: $" + amount);
        System.out.println("Number of Friends: " + friends);
        System.out.println("Each person owes: $" + share);
    }
}

public class expensive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();
        boolean running = true;

        System.out.println("=== Welcome to Smart Expense Tracker ===");

        while (running) {
            System.out.println("\n*** MAIN MENU ***");
            System.out.println("1. Add Personal Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. Split a Bill with Friends");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: $");
                    double am = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline

                    System.out.print("Enter category (e.g., Food, Travel): ");
                    String cat = scanner.nextLine();

                    System.out.print("Enter description: ");
                    String des = scanner.nextLine();

                    Expense newExpense = new Expense(am, cat, des);
                    manager.addexpense(newExpense);
                    break;

                case 2:
                    manager.viewExpenses();
                    break;

                case 3:
                    System.out.print("Enter total bill amount: $");
                    double billAmount = scanner.nextDouble();

                    System.out.print("Enter number of friends: ");
                    int friendsCount = scanner.nextInt();

                    manager.splitBill(billAmount, friendsCount);
                    break;

                case 4:
                    System.out.println("Thank you for using Expense Tracker. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }
}
