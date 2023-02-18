public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Scanner input = new Scanner(System.in);

        float acceleration;

        System.out.println("Enter V1: ");
        float v1 = input.nextFloat();
        System.out.println("Enter V0: ");
        float v0 = input.nextFloat();
        System.out.println("Enter T: ");
        float t = input.nextFloat();

        acceleration = (v1 - v0) / t;

        System.out.println("Acceleration: " + acceleration + " meter per seconds squared");
    }
}
