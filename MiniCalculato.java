import java.util.Scanner;

public class MiniCalculato {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double pro(double a, double b) {
        return a * b;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Mini Calculator ----");
        System.out.println("Select your operation from the list of options.");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Even number analysis");

        int userChoice = Integer.parseInt(scanner.nextLine());

        if (userChoice == 1) {
            System.out.println("Input your first number");
            double numOne = Double.parseDouble(scanner.nextLine());

            System.out.println("Input your second number");
            double numTwo = Double.parseDouble(scanner.nextLine());

            double result = add(numOne, numTwo);
            System.out.println(numOne + " + " + numTwo + " = " + result);

        } else if (userChoice == 2) {
            System.out.println("Input your first number");
            double numOne = Double.parseDouble(scanner.nextLine());

            System.out.println("Input your second number");
            double numTwo = Double.parseDouble(scanner.nextLine());

            double result = sub(numOne, numTwo);
            System.out.println(numOne + " - " + numTwo + " = " + result);

        } else if (userChoice == 3) {
            System.out.println("Input your first number");
            double numOne = Double.parseDouble(scanner.nextLine());

            System.out.println("Input your second number");
            double numTwo = Double.parseDouble(scanner.nextLine());

            double result = div(numOne, numTwo);
            System.out.println(numOne + " / " + numTwo + " = " + result);

        } else if (userChoice == 4) {
            System.out.println("Input your first number");
            double numOne = Double.parseDouble(scanner.nextLine());

            System.out.println("Input your second number");
            double numTwo = Double.parseDouble(scanner.nextLine());

            double result = pro(numOne, numTwo);
            System.out.println(numOne + " x " + numTwo + " = " + result);

        } else if (userChoice == 5) {
            System.out.println("Input your number");
            int userNum = Integer.parseInt(scanner.nextLine());

            boolean result = isEven(userNum);
            if (result) {
                System.out.println("Your number is an even number.");
            } else {
                System.out.println("Your number is not an even number.");
            }

        } else {
            System.out.println("Invalid option. Please run again.");
        }

        System.out.println("Thank you for choosing Casio mini ☺️");
        scanner.close();
    }
}
