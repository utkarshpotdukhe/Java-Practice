package que;
import java.util.Scanner;

public class que2 {
    // Create a class with a method to find the difference between the sum of the squares and
    // the square of the sum of the first n natural numbers.
    // Method Name calculateDifference
    // Method Description Calculate the difference
    // Argument int n
    // Return Type int - Sum
    // Logic Find the difference between the sum of the
    // squares of the first n natural numbers and the
    // square of their sum.
    // For Example if n is 10, you have to find
    // (1^2+2^2+3^2+….9^2+10^2) -
    // (1+2+3+4+5…+9+10)^

    public static int difference(int n) {
        // sum of squares of n natural numbers
        int sumSquareN = (n * (n + 1) * (2 * n + 1)) / 6;
        // sum of n natural numbers
        int sumN = (n * (n + 1)) / 2;
        // square of sum of n natural numbers
        int squareSumN = sumN * sumN;
        // difference
        return Math.abs(sumSquareN - squareSumN);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Number: " + n);
        System.out.println("Difference: " + difference(n));

    }
}
