public class Calculator {

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

    public double arraySum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }
}
