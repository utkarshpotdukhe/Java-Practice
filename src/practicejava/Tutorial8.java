package practicejava;
import java.util.Scanner;

public class Tutorial8 {
//Write a Java method to find the smallest number among three numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st no. :");
        double x = scanner.nextDouble();

        System.out.println("Input 2nd no. :");
        double y = scanner.nextDouble();

        System.out.println("Input 3rd no. :");
        double z = scanner.nextDouble();

        System.out.print("The smallest value is " + smallest(x, y, z) + "\n");
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }
}
