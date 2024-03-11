package que;

import java.util.Scanner;

public class que3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isIncreasing = checkNumber(number);

        if (isIncreasing) {
            System.out.println(number + " is an increasing number.");
        } else {
            System.out.println(number + " is not an increasing number.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    public static boolean checkNumber(int number) {
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(numStr.charAt(i));
            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));

            if (currentDigit >= nextDigit) {
                return false;
            }
        }

        return true;
    }
}

