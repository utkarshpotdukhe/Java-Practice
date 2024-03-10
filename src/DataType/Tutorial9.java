package DataType;

public class Tutorial9 {
    // Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

    public static void main(String[] args) {
        int n = 5;
        int s = n + 4 - 1;
        int i, j, x;

        for (i = 1; i <= n; i++) {
            for (x = s; x != 0; x--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }
}
