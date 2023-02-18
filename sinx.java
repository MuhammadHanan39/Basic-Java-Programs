import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Scanner input = new Scanner(System.in);


        System.out.println("Enter X: ");
        double x = input.nextDouble();
        System.out.println("Enter N: ");

        //angle to radian
        x = x * Math.PI/180;

        double sinx = x;
        int n = input.nextInt();
        int fact = 1;
        int sign = -1;

        input.close();

        for (int i = 0; i < n; i++)
        {
            //for calculating factorial
            int l = 2 * n + 1;
            for (int j = 1; j <= l; j++)
            {
                fact *= j;
            }

            sign = (int)Math.pow(-1, n);

            sinx += (sign * Math.pow(x, 2 * n + 1))/fact;
            fact = 1;
        }

        System.out.println("Sinx: " + sinx);

    }
}
