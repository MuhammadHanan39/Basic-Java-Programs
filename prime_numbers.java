import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        boolean state = true;


        int i = 1;

        int n1, n2;

        System.out.println("1\n2\n3");
        while (state)
        {

            n1 = 6 * i - 1;
            n2 = 6 * i + 1;

            if (n1 <= number)
            {
                System.out.println(n1);
            }

            if (n2 <= number)
            {
                System.out.println(n2);
            }

            else
            {
                state = false;
            }

            i++;

        }
    }
}
