interface MyCamera {
    void takeSnap();
    void recordVideo();

    // Private method: Helper implementation hidden inside the interface
    private void greet() {
        System.out.println("Good morning!");
    }

    // Default method: Allows backward-compatible functional updates
    default void record4kVideo() {
        greet(); // Calling the internal private helper
        System.out.println("Recording in ultra high-definition 4K resolution...");
    }
}

interface MyWiFi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

    void pickCall() {
        System.out.println("Connecting incoming call...");
    }
}

// Hybrid architecture: Extending a class while implementing multiple interfaces
class MySmartPhone extends MyCellPhone implements MyWiFi, MyCamera {
    
    @Override
    public void takeSnap() {
        System.out.println("Taking a quick snap shot.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a standard video.");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Scanning local frequencies... Getting list of networks.");
        return new String[]{"Nikhil_WiFi", "Kali_Network", "Kli_5G"};
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Establishing secure connection to: " + network);
    }
}

public class InterfaceDefaultMethods {
    public static void main(String[] args) {
        System.out.println("--- Testing Advanced Interface Controls ---");
        
        MySmartPhone ms = new MySmartPhone();
        
        // Executing the inherited interface default method
        ms.record4kVideo();
        System.out.println();
        
        // Fetching and iterating through network arrays
        String[] availableNetworks = ms.getNetworks();
        System.out.println("--- Available Networks ---");
        for (String network : availableNetworks) {
            System.out.println("• " + network);
        }  
    }
}
