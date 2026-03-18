import java.util.Scanner;
import java.util.Random;

class Esp {
    public static void main(String[] args) { // Added {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        String[] colours = {"Red", "Green", "Blue", "Orange", "Yellow"};
        int correct = 0; // Counter declared BEFORE loop
        
        // Loop runs 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Round " + (i + 1) + ":");
            
            // Select random color
            int index = rand.nextInt(5);
            String selectedColor = colours[index];
            
            // Ask user for color
            System.out.println("Enter the color (Red, Green, Blue, Orange, Yellow):");
            String guess = scanner.nextLine();
            
            // Show what was selected
            System.out.println("The selected color was: " + selectedColor);
            
            // Check guess (Use .equals() for Strings)
            if (guess.equals(selectedColor)) {
                System.out.println("Your guess is correct!");
                correct++; // Increment counter
            } else {
                System.out.println("Your guess is not correct.");
            }
        }
        
        // Print result AFTER loop finishes
        System.out.println("You guessed correctly " + correct + " times out of 10.");
        
        scanner.close();
    } // Close main
} // Close class