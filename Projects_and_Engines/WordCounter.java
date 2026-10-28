package Projects_and_Engines;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Welcome to Java Word & Character Counter ===");
        System.out.println("Enter your text/sentence below:");
        
        // User से पूरा पैराग्राफ या सेंटेंस इनपुट लेना
        String inputText = scanner.nextLine();
        
        // 1. कैरेक्टर्स (Total Characters) काउंट करना (spaces के साथ)
        int totalCharacters = inputText.length();
        
        // 2. बिना स्पेस के कैरेक्टर्स काउंट करना
        int charactersWithoutSpaces = inputText.replace(" ", "").length();
        
        // 3. वर्ड्स (Total Words) काउंट करना
        int totalWords = 0;
        if (!inputText.trim().isEmpty()) {
            // \\s+ का मतलब है एक या एक से ज़्यादा स्पेस के बेसिस पर वर्ड्स को अलग करना
            String[] words = inputText.trim().split("\\s+");
            totalWords = words.length;
        }
        
        // रिजल्ट प्रिंट करना
        System.out.println("\n--- Analysis Result ---");
        System.out.println("Total Words: " + totalWords);
        System.out.println("Total Characters (with spaces): " + totalCharacters);
        System.out.println("Total Characters (without spaces): " + charactersWithoutSpaces);
        
        scanner.close();
    }
}
