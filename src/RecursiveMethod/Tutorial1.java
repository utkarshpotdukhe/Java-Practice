package RecursiveMethod;
import java.util.Scanner;

public class Tutorial1 {
    // Write a Java recursive method to calculate the factorial of a given positive integer.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input for factorial: ");
        int num = scanner.nextInt();

        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
