import java.util.Scanner;

public class TableDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // to activate the user input capability.

        System.out.println("Enter the number of rows : ");
        int row = scanner.nextInt();
        // to add a user input number.

        int num = 1;
        // initialized the multiply to value to num.
        do
        // do loop to assign value and repeat the do block till while is satisfied.
        {
            int a = 1;
            do
            // nested do loop.

            {
                System.out.print(num*a + "\t");
                a++;
                // increasing the value of num by 1 each iteration.

            }while (a<=3);
            // must only repeat the iteration till 3 column as a is <=3.

            num++;
            System.out.println();
            // blank sout for spacing.
        }while (num<=row);
        // while for the first Do block. the entire block will run until the number is equal as the user input.

    }
}