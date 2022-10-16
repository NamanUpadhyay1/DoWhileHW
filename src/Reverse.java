import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // scanner used for user input

        System.out.println("Input any 5 'Digit' number.");
        int number = scanner.nextInt();
        // nextInt(); used for integer user input.

        int reverse = 0;
        int c;
        // c is the remainder.

        if (number>99999 || number<10000){
            // using if block so that the user input doesnt go above or below 5 digits.

            System.out.println("Please Enter a 5 digit number.");

        }
        else {
            while (number!=0){
                // (number!=0) - when its true it will execute the while block.

                c=number%10;
                // number%10 will give the remainder of the division of the num after ever iteration(there will be total 5 iterations).
                reverse = reverse*10 + c;
                // current value of reverse is 0 so here, for exg : if the user input is 12345 then this statement will be 0*10 + the remainder(5,4,3,2,1).
                number = number/10;
                // number/10 will divide the num by 10 so for exg : user input is 12345 then the answer here will be 1234.
                // when the number = number/10 will give 0 as answer then the iterations will stop.
            }
            System.out.println("The number in reverse is : ");
            System.out.println(reverse);
            
        }

    }

}