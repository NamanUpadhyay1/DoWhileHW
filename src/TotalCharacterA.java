import java.util.Scanner;

public class TotalCharacterA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Scanner object for user input.
        System.out.println("Enter your name : ");
        String name = scanner.next();
        //scanner.next(); used for string input.

        int a = 0;
        // a will be used as marker which moves from first character to the last one.

        for (int i = 0; i < name.length(); i++)
        // for loop will continue till the last letter of the name.
        {
            if (name.charAt(i) == 'a')
            // if block used here to check the number of times the letter "A" occurred in the input name.
            {
                a++;
                // to move to the next letter.
            }

        }
        if (a == 1)
        // to give output if A occurred only 1 time.(Grammar)
        {
            System.out.println("A has occurred " + a + " time in your name.");
        }
        else if (a>1)
        {
            System.out.println("A has occurred " + a + " times in your name.");
        }
        else
        // if there are no A's in the name then this block will be executed.
        {
            System.out.println("There are no 'A's in your name.");
        }

    }
}