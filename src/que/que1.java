package que;
import java.util.Scanner;

public class que1 {
    // Create a class with a method which can calculate the sum of first n natural numbers which
    // are divisible by 3 or 5.
    // Method Name calculateSum
    // Method Description Calculate Sum
    // Argument int n
    // Return Type int-sum
    // Logic Calculate the sum of first n natural numbers which
    // are divisible by 3 or 5.

    public int calculateSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        que1 obj = new que1();
        int result = obj.calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers divisible by 3 or 5: " + result);
    }
}
