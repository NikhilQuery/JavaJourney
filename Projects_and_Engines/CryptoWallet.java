package Projects_and_Engines;

import java.util.Scanner;

class Cryptocurrency {
    String name;
    double balance;
    private int pin;

    public Cryptocurrency(String name, double balance, int pin) {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }

    public double calculateFees(double amount) {
        return 0.0;
    }

    public boolean verifyPin(int enteredPin) {
        return this.pin == enteredPin;
    }
}

class Bitcoin extends Cryptocurrency {
    public Bitcoin(double balance, int pin) {
        super("Bitcoin", balance, pin);
    }

    @Override
    public double calculateFees(double amount) {
        return amount * 0.02;
    } 
}

class Ethereum extends Cryptocurrency {
    public Ethereum(double balance, int pin) {
        super("Ethereum", balance, pin);
    }

    @Override
    public double calculateFees(double amount) {
        return amount * 0.01;
    }
}

public class CryptoWallet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Cryptocurrency btc = new Bitcoin(0.5, 1234);  // PIN: 1234
        Cryptocurrency eth = new Ethereum(2.5, 9988); // PIN: 9988
        Cryptocurrency selectedCrypto = null;

        System.out.println("=== WELCOME TO LIVE CRYPTO WALLET ===");
        System.out.println("1. Bitcoin (BTC)");
        System.out.println("2. Ethereum (ETH)");
        System.out.print("Select your cryptocurrency (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            selectedCrypto = btc;
        } else if (choice == 2) {
            selectedCrypto = eth;
        } else {
            System.out.println(" Invalid choice! Exiting system.");
            return;
        }

        System.out.println("\nYou selected: " + selectedCrypto.name);
        System.out.println("Current Balance: " + selectedCrypto.balance);

        System.out.print("\nEnter amount to transfer: $");
        double amount = scanner.nextDouble();

        System.out.print("Enter your 4-digit security PIN: ");
        int inputPin = scanner.nextInt();

        System.out.println("\n--- Processing Transaction ---");
        
        if (selectedCrypto.verifyPin(inputPin)) {
            double fee = selectedCrypto.calculateFees(amount);
            System.out.println(" PIN Verified! Transaction successful.");
            System.out.println("   Network Fees: $" + fee);
        } else {
            System.out.println(" Transaction Failed! Incorrect security PIN.");
        }

        scanner.close();
    }
}

