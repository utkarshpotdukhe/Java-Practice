package Array;
import java.util.Scanner;

public class Tutorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cars = {"Thar", "BMW", "Porsche", "Creta"};

        System.out.println("Enter a number for car: 1 - Thar, 2 - BMW, 3 - Porsche, 4 - Creta");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= cars.length) {
            System.out.println("You selected: " + cars[choice - 1]);
        } else {
            System.out.println("Invalid car number.");
        }

        System.out.println("All available cars:");
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
