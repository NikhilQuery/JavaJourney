package Projects_and_Engines;
import java.util.Scanner;

interface GPSLocator {
    void updateLocation(double latitude, double longitude);
}

abstract class Vehicle {
    private String vehicleNumber;
    protected String driverName;
    public double baseFare;
    public boolean isAvailable;

    public Vehicle(String vehicleNumber, String driverName, double baseFare) {
        this.vehicleNumber = vehicleNumber;
        this.driverName = driverName;
        this.baseFare = baseFare;
        this.isAvailable = true;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public abstract double calculateFare(double distance);
    
    public abstract void showVehicleSpecs();
}

class StandardCab extends Vehicle {
    
    public StandardCab(String vehicleNumber, String driverName, double baseFare) {
        super(vehicleNumber, driverName, baseFare);
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * 12.0);
    }

    @Override
    public void showVehicleSpecs() {
        System.out.println("Standard Sedan - Driver: " + driverName + " | Plate: " + getVehicleNumber());
    }
}

class PremiumLuxuryCab extends Vehicle implements GPSLocator {
    private double luxuryTax;

    public PremiumLuxuryCab(String vehicleNumber, String driverName, double baseFare, double luxuryTax) {
        super(vehicleNumber, driverName, baseFare);
        this.luxuryTax = luxuryTax;
    }

    @Override
    public double calculateFare(double distance) {
        return baseFare + (distance * 25.0) + luxuryTax;
    }

    @Override
    public void showVehicleSpecs() {
        System.out.println("Premium SUV (AC + Wi-Fi) - Driver: " + driverName + " | Plate: " + getVehicleNumber());
    }

    @Override
    public void updateLocation(double latitude, double longitude) {
        System.out.println("[GPS Log] Premium Cab live coordinates updated to: (" + latitude + ", " + longitude + ")");
    }
}

public class RideSharingApp {

    static void printBanner() {
        System.out.println("===========================================");
        System.out.println("     METRO RIDE-SHARING SYSTEM V1.0        ");
        System.out.println("===========================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printBanner();

        System.out.print("Enter Passenger Name: ");
        String passengerName = scanner.nextLine();

        System.out.println("Hello, " + passengerName.trim().toUpperCase() + "! Searching for nearby rides...");

        Vehicle[] fleet = new Vehicle[3];
        fleet[0] = new StandardCab("DL-3C-1234", "Ramesh Kumar", 50.0);
        fleet[1] = new PremiumLuxuryCab("MH-02-7777", "Vikram Singh", 150.0, 80.0);
        fleet[2] = new StandardCab("KA-51-9876", "Amit Sharma", 50.0);

        System.out.print("Enter total distance for your ride (in km): ");
        double travelDistance = scanner.nextDouble();

        System.out.println("\n--- Available Rides & Estimated Fares ---");
        
        for (Vehicle cab : fleet) {
            cab.showVehicleSpecs(); 
            double estimatedFare = cab.calculateFare(travelDistance);
            System.out.println("Estimated Fare: INR " + estimatedFare);

            if (cab instanceof GPSLocator) {
                GPSLocator gpsCab = (GPSLocator) cab;
                gpsCab.updateLocation(28.6139, 77.2090);
            }
            System.out.println("-------------------------------------------");
        }

        System.out.print("Do you want to confirm a booking? (1 for Yes, 0 for No): ");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            System.out.println("Booking Confirmed! Your driver is on the way.");
        } else {
            System.out.println("Booking cancelled by user.");
        }

        System.out.println("\nCleaning up active system connections...");
        for (int i = 3; i > 0; i--) {
            System.out.println("Closing port session in " + i + "...");
        }

        System.out.println("System Safe Shutdown. Goodbye!");
        scanner.close();
    }
}
