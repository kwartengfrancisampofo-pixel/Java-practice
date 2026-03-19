import java.util.Scanner;

class SquareDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInt = 0;

        // Input Validation: Ensure number is between 1 and 15
        while (userInt < 1 || userInt > 15) {
            System.out.println("Enter any number from 1 to 15");
            userInt = scanner.nextInt();
        }

        // Nested Loops: Draw the square
        for (int j = 1; j <= userInt; j++) {       // Rows
            for (int i = 1; i <= userInt; i++) {   // Columns
                System.out.print("X");
            }
            System.out.println();                  // New line after each row
        }

        scanner.close();
    }
}