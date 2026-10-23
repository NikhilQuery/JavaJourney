package Oops_Concepts;
// 1. Interface defining basic vehicle functionalities
interface Vehicle {
    int SPEED_LIMIT = 45; // Implicitly public, static, and final

    void applyBrake(int decrement);
    void speedUp(int increment);
}

// 2. Interface defining different horn sound functionalities
interface HornSystem {
    void playMelodyHorn();
    void playClassicHorn();
}

// 3. A concrete class implementing multiple interfaces
class PremiumBicycle implements Vehicle, HornSystem {
    
    void ringBell() {
        System.out.println("Tring Tring!");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Brakes applied. Speed decreased by: " + decrement + " km/h");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Accelerating. Speed increased by: " + increment + " km/h");
    }

    @Override
    public void playMelodyHorn() {
        System.out.println("Playing Melody: Main Nikla Gaddi Leke...");
    }

    @Override
    public void playClassicHorn() {
        System.out.println("Playing Classic: Peep Peep!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("--- Testing Multiple Interfaces ---");
        
        PremiumBicycle myBike = new PremiumBicycle();
        
        myBike.applyBrake(5);
        System.out.println("Maximum Speed Limit: " + Vehicle.SPEED_LIMIT); // Interface name se direct access standard hai
        
        myBike.playMelodyHorn();    
        myBike.playClassicHorn();    
        myBike.ringBell();
    }
}
