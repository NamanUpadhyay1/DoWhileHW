import java.util.Scanner;

public class AddFiveDigitNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // to activate the user input capability.
        System.out.println("Enter any 5 digit number : ");
        int num = scanner.nextInt();
        // to add a user input number.
        int add = 0;
        int digit;

        if (num>99999 || num<10000)
        // to make sure that the number does is not higher or lower than a 5-digit number.
        {

            System.out.println("Please enter a 5 digit number.");

        }
        else {

            while (num>0){

                digit = num%10;
                // for last digit of the input number.
                add=add+digit;
                // to add the last digit.
                num=num/10;
                //to remove the last digit from the input.

            }
            System.out.println("The addition of digits of " + " is " + add);

        }


    }

}
