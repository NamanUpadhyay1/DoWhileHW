import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Creating scanner object to access user input feature.
        System.out.println("Enter any number : ");
        int num = scanner.nextInt();
        // scanner.nextInt(); to get user integer input.
        int remainder;
        int add = 0;
        int a = num;
        // initializing a = num so that in the printing statement the original number will be printed.
        while (num>0){

            remainder=num%10;
            // to get the last digit of the current iteration.
            add=(add*10)+remainder;
            // calculation for the palindrome number.
            num=num/10;
            // to remove the last digit of the current iteration.
        }
        if (a==add)
        {
            System.out.println(a + " is a palindrome number.");
        }
        else
        {
            System.out.println(a + " is not a palindrome number.");
        }

    }

}