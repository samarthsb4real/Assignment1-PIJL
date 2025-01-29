import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput userInput = new UserInput(scanner);
        Calculator calculator = new Calculator();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Fibonacci Sequence");
            System.out.println(
                    "6. Sum of Array\n7. Mean of Array\n8. Variance of Array\n9. Standard Deviation\n10. Exit");
            int choice = userInput.getIntegerInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    double[] addInputs = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.add(addInputs[0], addInputs[1]));
                    break;
                case 2:
                    double[] subInputs = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.subtract(subInputs[0], subInputs[1]));
                    break;
                case 3:
                    double[] mulInputs = userInput.getTwoNumbers();
                    System.out.println("Result: " + calculator.multiply(mulInputs[0], mulInputs[1]));
                    break;
                case 4:
                    double[] divInputs = userInput.getTwoNumbers();
                    if (divInputs[1] != 0) {
                        System.out.println("Result: " + calculator.divide(divInputs[0], divInputs[1]));
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                case 5:
                    int n = userInput.getIntegerInput("Enter the number of Fibonacci terms: ");
                    calculator.fibonacci(n);
                    break;
                case 6:
                    double[] array = userInput.getArrayInput();
                    System.out.println("Sum: " + calculator.arraySum(array));
                    break;
                case 7:
                    array = userInput.getArrayInput();
                    System.out.println("Mean: " + calculator.arrayMean(array));
                    break;
                case 8:
                    array = userInput.getArrayInput();
                    System.out.println("Variance: " + calculator.arrayVariance(array));
                    break;
                case 9:
                    array = userInput.getArrayInput();
                    System.out.println("Standard Deviation: " + calculator.arrayStdDev(array));
                    break;
                case 10:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
