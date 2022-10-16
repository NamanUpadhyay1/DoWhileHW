import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner object for user input.
        System.out.println("Enter the Math-Table number : ");
        int num = scanner.nextInt();
        // scanner.nextInt(); for integer data input.
        System.out.println("The Math-Table of " + num + " is : ");

            for (int i = 1; i <= 10; i++)
            // for loop will repeat and print till 10.

            {

                int b = num * i;
                // b is the answer of the multiplication between given number and i.
                System.out.println(num + " x " + i + " = " + b);

            }

    }
}