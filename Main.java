/*
 * Name: Samarth Bhadane
 * PRN: 24070126503
 * Batch: A2
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize required objects
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();

        // Control variable for program loop
        boolean exit = false;
        while (!exit) {
            // Display menu options to the user
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci Sequence");
            System.out.println(
                    "6. Sum of Array\n7. Mean of Array\n8. Variance of Array\n9. Standard Deviation\n10. Exit");
            // Get user's menu choice
            int choice = userInput.getIntegerInput("Enter your choice: ");

            // Process user's choice using switch statement
            switch (choice) {
                case 1:
                    // Addition operation: Get two numbers and calculate their sum
                    double[] addInputs = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.add(addInputs[0], addInputs[1]));
                    break;
                case 2:
                    // Subtraction operation: Get two numbers and calculate their difference
                    double[] subInputs = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.subtract(subInputs[0], subInputs[1]));
                    break;
                case 3:
                    // Multiplication operation: Get two numbers and calculate their product
                    double[] mulInputs = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.multiply(mulInputs[0], mulInputs[1]));
                    break;
                case 4:
                    // Division operation: Get two numbers and calculate their quotient
                    double[] divInputs = userInput.getTwoNumbers();
                    if (divInputs[1] != 0) {
                        System.out.println("Result: " + calculator.divide(divInputs[0], divInputs[1]));
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case 5:
                    // Fibonacci sequence operation: Get the number of terms and display the
                    // sequence
                    int n = userInput.getIntegerInput("Enter the number of Fibonacci terms: ");
                    calculator.fibonacci(n);
                    break;
                case 6:
                    // Sum of array operation: Get an array and calculate its sum
                    double[] array = userInput.getArrayInput();
                    System.out.println("Sum: " + calculator.arraySum(array));
                    break;
                case 7:
                    // Mean of array operation: Get an array and calculate its mean
                    array = userInput.getArrayInput();
                    System.out.println("Mean: " + calculator.arrayMean(array));
                    break;
                case 8:
                    // Variance of array operation: Get an array and calculate its variance
                    array = userInput.getArrayInput();
                    System.out.println("Variance: " + calculator.arrayVariance(array));
                    break;
                case 9:
                    // Standard deviation of array operation: Get an array and calculate its
                    // standard deviation
                    array = userInput.getArrayInput();
                    System.out.println("Standard Deviation: " + calculator.arrayStdDev(array));
                    break;
                case 10:
                    // Exit the program
                    exit = true;
                    break;
                default:
                    // Handle invalid menu choice
                    System.out.println("Invalid choice. Try again.");
            }
        }
        // Close the scanner
        scanner.close();
    }
}
