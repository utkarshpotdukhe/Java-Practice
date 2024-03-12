package IfElse;
import java.util.Scanner;

public class Tutorial3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the hour (in 24-hour format):");
        int hour = scanner.nextInt();

        var GM = "Good Morning";
        var GAF = "Good Afternoon";
        var GE = "Good Evening";
        var GN = "Good Night";

        if (hour >= 4 && hour < 12) {
            System.out.println(GM);
        } else if (hour >= 12 && hour < 17) {
            System.out.println(GAF);
        } else if (hour >= 17 && hour < 20) {
            System.out.println(GE);
        } else {
            System.out.println(GN);
        }
    }
}
