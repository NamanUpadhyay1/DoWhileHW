public class DivisibleBy3And5 {

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

            for (int i = 1 ; i<=100 ; i++)
            // for loop will repeat till 101.
            {

                if (i % a == 0)
                // if block will be printed if the number's modulus is 0.
                {

                    System.out.println(i + " is divisible by 3");

                }
            }
        System.out.println("   ");
            // used just for spacing.

                for (int j = 1; j <=100 ; j++)
                // for loop will repeat till 101.
                {

                    if (j%b==0)
                    // if body will be executed if the number's modulus is 0.
                    {

                        System.out.println(j + " is divisible by 5");
                    }

                }

            }

        }