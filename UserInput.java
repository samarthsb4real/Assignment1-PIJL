import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getIntegerInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public double[] getTwoNumbers() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return new double[]{num1, num2};
    }

    public double[] getArrayInput() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        return array;
    }
}
