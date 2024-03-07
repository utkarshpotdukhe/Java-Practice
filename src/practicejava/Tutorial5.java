package practicejava;
import java.util.Scanner;

public class Tutorial5 {
//    Write a Java program that takes two numbers as input and displays the product of two numbers.
//    Test Data:
//    Input first number: 25
//    Input second number: 5
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter num1 = ");
    double num1 = scanner.nextDouble();

    System.out.println("enter num2 = ");
    double num2 = scanner.nextDouble();

    double addition = num1 + num2;
    double subtraction = num1 - num2;
    double multiplication= num1 * num2;
    double divide = num1 / num2;

    System.out.println("addition " + addition);
    System.out.println("subtraction " + subtraction);
    System.out.println("multiplication " + multiplication);
    System.out.println("divide " + divide);
}

    }

