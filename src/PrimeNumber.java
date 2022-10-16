import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //For User input
        System.out.println("Enter any number : ");
        int a = scanner.nextInt();
        //For user integer input
        int c = 0;

        for (int i = 2; i <= a/2 ; i++) {
            // i = 2 and i <= a/2 because it will terminate when the condition will fail.

            if (a%i==0){
                c++;
                // if the (a%i==0) will be true then the value of c will be incremented.
                break;
            }

            }
        if (c==0 && a!=1){
            // when both c is 0 and user input is not equal to 1 then it will execute the if block.
            System.out.println(a + " is a prime number.");
        }
        else
            // when either c is not 0 or user input is equal to 1 then else block will be executed.
        {
            System.out.println(a + " is not a prime number.");
        }

        }

    }