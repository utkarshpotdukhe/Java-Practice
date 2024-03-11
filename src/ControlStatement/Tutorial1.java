package ControlStatement;

public class Tutorial1 {
    //Write a Java program to display Pascal's triangle
    public static void main(String[] args) {
        int row = 5, i, j, space, num;
        for (i = 0; i < row; i++) {
            for (space = row; space > i; space--) {
                System.out.print(" ");
            }
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    }
}