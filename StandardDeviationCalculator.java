import java.util.Scanner;

 class StandardDeviationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Using fixed even numbers 2-20 for calculations
        int[] evenNumbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        // Average
        int sum = 0;
        for(int i = 0; i < evenNumbers.length; i++) {
            sum += evenNumbers[i];
                    }
        double average = (double) sum / evenNumbers.length;
        
        // Factorial
        int roundedAvg = (int) Math.round(average); 
        double factorial = 1.0;
        for (int i = 1; i <= roundedAvg; i++) {
            factorial *= i;
        }
        
// intake of user input

int[] userNumbers = new int[20];
        System.out.println("Enter 20 numbers (1 to 20):");
        for (int i = 0; i < 20; i++) {
            System.out.print("Input " + (i + 1) + ": ");
            userNumbers[i] = scanner.nextInt();
        }

        // Determining even numbers from user input
        int[] filteredEvens = new int[10]; // max 10 evens
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if (userNumbers[i] % 2 == 0 && count <10) {
                filteredEvens[count] = userNumbers[i];
                count++;
            }
        }
        System.out.println("\nFiltered even numbers from your input:");
        for (int i = 0; i < count; i++) {
            System.out.print(filteredEvens[i] + " ");
        }
        System.out.println();

        // Square root of factorial
        double sqrtFactorial = Math.sqrt(factorial);
        
        // Step 7: Standard deviation of factorial and sqrt
        double mean = (factorial + sqrtFactorial) / 2;
        double sumSquaredDiff = Math.pow(factorial - mean, 2) + Math.pow(sqrtFactorial - mean, 2);
        double standardDeviation = Math.sqrt(sumSquaredDiff / 2);

    // Output of results
System.out.println("Average of even numbers (fixed 2-20): " + average);
System.out.println("Factorial of average: " + factorial);
System.out.println("Square root of factorial: " + sqrtFactorial);
System.out.println("Standard deviation: " + standardDeviation);

        scanner.close();
    }
}