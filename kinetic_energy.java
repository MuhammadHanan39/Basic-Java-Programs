import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float ke, m, v;

        Scanner s = new Scanner(System.in);

        System.out.println("Enter m: ");
        m = s.nextFloat();

        System.out.println("Enter m: ");
        v = s.nextFloat();

        ke = (1/2f) * (m * v);
        System.out.println("Kinetic Energy is: " + ke);

    }
}
