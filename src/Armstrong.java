import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner object to use user input function.
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        // nextInt(); so that user can add integer.

        int remainder;
        int answer = 0;
        int count = 0;
        int original;
        original = num;
        // original = num so that we can print the input number for out output.

        while (original!=0){

            remainder=original%10;
            // to get the last digit of the input
            original/=10;
            // to remove the last digit of the input.
            count++;
            // to increase the count by 1(it will be used in Math.pow for raised to number).

        }

        original=num;

        while (original!=0)
        {
            remainder=original%10;
            answer+=Math.pow(remainder, count);
            // Math.pow is the in-built function for the usage of power/raised to numbers.
            original/=10;

        }
        if (answer==num)
        {

            System.out.println(num + " is an armstrong number.");
        }
        else
        {
            System.out.println(num + " is not an armstrong number.");
        }
    }

}
