import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // to activate the user input capability.
        System.out.println("Enter any 5 digit number : ");
        int num = scanner.nextInt();
        // to add a user input number.
        int add = 0;
        int digit;
        int even = 0;
        int odd = 0;

        if (num>99999 || num<10000)
        // to make sure that the number does is not higher or lower than a 5-digit number.
        {

            System.out.println("Please enter a 5 digit number.");

        }
        while (num>0)
        {
            int remainder = num%10;
            // to get the last digit of the number.
            if (remainder%2==0)
            // if block for even number.
            {
                even++;
                // to increase the even count.
            }
            else
            // else block for odd number.
            {
                odd++;
                // to increase the odd count.
            }
            add=add+remainder;
            // for addition output.
            num=num/10;
            // to eliminate the last digit for the next iteration.

        }

            System.out.println("Total Even numbers are : " + even);
            System.out.println("Total Odd numbers are : " + odd);
            System.out.println("The addition of digits of " + " is " + add);

    }

}