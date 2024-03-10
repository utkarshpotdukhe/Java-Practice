package DataType;
import java.util.Scanner;

public class Tutorial4 {
    //body bmi
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input weight in kilogram: ");
        double weight = scanner.nextDouble();
        System.out.print("Input height in meters: ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m2");
    }
}
