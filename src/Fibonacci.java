import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);                           // For user input
        System.out.println("Enter the end number of Fibonacci Series : ");

        int a = scanner.nextInt();                                          // user can input integer

        System.out.println("Fibonacci Series with the " + a + " as the ending number : ");

        int b = 0;                                                         // assigning b as 0 for calculation
        int c = 1;                                                         // assigning c as 1 for calculation

        System.out.print(b + ", " + c);

        for (int i = 1; i <= a; i++) {                                    // used i as 1 because 0 and 1 are already being printed

            int d = b + c;                                                // b+c till it i<=a is satisfied
            System.out.print(", " + d);
            b=c;                                                          // assigning b = c for the loop iteration
            c=d;                                                          // assigning c = d for the loop iteration

        }

    }

}
