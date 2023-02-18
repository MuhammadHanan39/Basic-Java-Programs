import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int x = number % 10;
        int y = (number / 10) % 10;
        int z = (number / 100) % 100;

        if (x * x * x + y * y * y + z * z * z == number)
        {
            System.out.println(number);
        }

        else
        {
            System.out.println("Not a magic number!");
        }
    }
}
