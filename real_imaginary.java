import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter real part: ");
        int realPart = input.nextInt();
        System.out.println("Enter imaginary part: ");
        int imaginaryPart = input.nextInt();

        System.out.println(realPart + " + " + imaginaryPart + "i");


    }
}
