// Calculator class for basic math operations
public class Calculator {

    // Basic arithmetic operations
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    // Fibonacci sequence generator
    public void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Array operations
    public double arraySum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    // Statistical calculations
    public double arrayMean(double[] array) {
        return arraySum(array) / array.length;
    }

    public double arrayVariance(double[] array) {
        double mean = arrayMean(array);
        double variance = 0;
        for (double num : array) {
            variance += Math.pow(num - mean, 2);
        }
        return variance / array.length;
    }

    public double arrayStdDev(double[] array) {
        return Math.sqrt(arrayVariance(array));
    }
}
