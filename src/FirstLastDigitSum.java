import java.util.Scanner;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner object to use user input function.
        System.out.println("Enter any five digit number : ");
        int num = scanner.nextInt();
        // nextInt(); so that user can add integer.

        int first = 0;
        int last = 0;

        if (num>99999 || num<10000)
        // to make sure that the number does is not higher or lower than a 5-digit number.

        {
            System.out.println("Please enter a 5-digit number.");
        }

        last=num%10;
        // to get the last number.

        while (num!=0)

        {
            first=num%10;
            // to get the first number after multiple iterations.
            num=num/10;
            // to remove the end numbers one by one through the loop.
        }
        System.out.println("Sum of " + first + " + " + last + " is : " + (first + last));
    }

}