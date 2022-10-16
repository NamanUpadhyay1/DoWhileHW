import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // object scanner for user input.
        System.out.println("Enter the Factorial Number : ");
        int num = scanner.nextInt();
        // nextInt(); for user integer input.

        int a = 1;
        int factorial = 1;
        // both a and factorial are variables.

        while (a<=num)
        // (a<=num) so that it does not exceed the given number for factorial.
        {

            factorial=factorial*a;
            a++;
            // a++ increments "a" by 1.

        }

        System.out.println("Factorial of " + num + " is " + factorial);

    }

}