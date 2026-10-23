package Projects_and_Engines;
// MAKING GUESSING GAME
import java.util.Random;
import java.util.Scanner;

class Game {
    // Standard variable naming with private encapsulation
    private int systemNumber;
    private int userInputNumber;
    private int noOfGuesses = 0;
    private Scanner sc; // Declared once at the class level to reuse across methods

    // Constructor: Generates a random number when the game starts
    public Game() {
        Random ran = new Random();
        // ran.nextInt(100) generates 0 to 99. Adding 1 sets the range from 1 to 100.
        this.systemNumber = ran.nextInt(100) + 1;
        this.sc = new Scanner(System.in); // Initializing the Scanner instance
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Method to handle clean and safe user input
    public void takeUserInput() {
        System.out.print("Guess the number (1 to 100): ");
        if (sc.hasNextInt()) {
            userInputNumber = sc.nextInt();
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
            sc.next(); // Clear the invalid input from the buffer
            takeUserInput(); // Recursive call to prompt for input again
        }
    }

    // Method to check if the guessed number matches the system number
    public boolean isCorrectNumber() {
        noOfGuesses++; // Increment the attempt counter on every guess
        
        if (userInputNumber == systemNumber) {
            System.out.printf("\n Yes! You guessed it right. The number was %d.\n", systemNumber);
            System.out.printf(" Total attempts taken: %d\n", noOfGuesses);
            sc.close(); // Closing the Scanner to prevent resource leaks
            return true;
        } else if (userInputNumber < systemNumber) {
            System.out.println(" Too Low! Try a bigger number.\n");
        } else {
            System.out.println(" Too High! Try a smaller number.\n");
        }
        return false;
    }
}

public class GuessingGame { 
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Number Guessing Game ===");
        
        Game game = new Game();
        boolean isMatched = false;

        // Loop runs continuously until isMatched becomes true
        while (!isMatched) {
            game.takeUserInput();
            isMatched = game.isCorrectNumber();
        }
    }
}