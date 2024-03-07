package practicejava;
import java.util.Scanner;

public class Tutorial10 {
    //Write a Java method to count all vowels in a string.
    //Test Data:
    //Input the string:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the string: ");
        String string = scanner.nextLine();

        System.out.print("Number of  Vowels in the string: " + count_Vowels(string)+"\n");
    }
    public static int count_Vowels(String string)
    {
        int count = 0;
        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i'
                    || string.charAt(i) == 'o' || string.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

}
