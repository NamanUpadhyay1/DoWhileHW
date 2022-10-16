import java.util.Scanner;

public class NaturalNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner obj created for user input.

        int add = 0;
        // assigning base value of add as 0(later will increase by 1).

        System.out.println("Starting number : ");
        int i = scanner.nextInt();
        // scanner.nextInt(); used for user integer input.
        System.out.println("Ending number : ");
        int n = scanner.nextInt();

        for (int j = 1; j <= n ; j++)
        // for loop will repeat itself till the value of j becomes greater than the user input.
        {

            add = add+j;
            // after the first iteration the value of add will become 1.

        }
        System.out.println("The addition of natural numbers between " + i + " and " + n + " is : " );
        System.out.println(add);

    }

}
