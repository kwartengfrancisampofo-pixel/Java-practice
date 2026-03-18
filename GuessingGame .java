import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        // Generate random number (0-99)
        int target = rand.nextInt(100); 
        int userGuess = 0;
        
        System.out.println("I have picked a number between 0 and 99.");
        
        // Loop until guess is correct
        while (userGuess != target) {
            System.out.println("Input your number:");
            userGuess = scanner.nextInt();
            
            if (userGuess > target) {
                System.out.println("Too high, try again.");
            } else if (userGuess < target) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("You guessed right!");
            }
        }
        
        scanner.close();
    }
}