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
            }
        }
        scanner.close();
    }
}
