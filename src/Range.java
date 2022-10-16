import java.util.Scanner;

public class Range {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // object scanner for user input

        System.out.println("Enter the Base number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the Last number : ");
        int b = scanner.nextInt();
        System.out.println("Range between " + a + " and " + b + " is :");

        for (int i = a; i <= b ; i++) {                 // for loop used for automatic iteration

            System.out.println(i);

        }

    }

}