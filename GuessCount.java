import java.util.Scanner;
import java.util.Random;

public class GuessCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int number = rand.nextInt(100);
        int UserNum = 0;
        int UserCount = 0;
        
        System.out.println("The number is between 0 and 100");
        
        while (UserNum != number) {
            System.out.println("Input your number:");
            UserNum = scanner.nextInt();
            UserCount++;
            
            if (UserNum == number) {
                System.out.println("You're right!");
            } else if (UserNum > number) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }
        
        // Print the number of guesses (Q18 requirement)
        System.out.println("You guessed the number in " + UserCount + " tries.");
        
        scanner.close(); // Inside main, before closing brace
    }
}
