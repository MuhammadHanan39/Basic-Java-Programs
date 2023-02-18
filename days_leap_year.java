import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int days = 0;
        System.out.println("Enter Year: ");
        int year = input.nextInt();
        System.out.println("Enter Month: ");
        int month = input.nextInt();

        days = switch (month)
                {
                    case 1, 3, 5, 7, 8, 10, 12 -> 31;
                    case 4, 6, 9, 11 -> 30;

                    case 2 -> {if (year % 4 == 0)
                    {
                        yield 29;
                    }
                    else
                    {
                        yield 28;
                    }
                    }
                    default -> 0;
                };


        if (days == 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            System.out.println("Days: " + days);
        }
    }
}
