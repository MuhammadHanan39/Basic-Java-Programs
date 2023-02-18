public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Amount: ");
        int amount = input.nextInt();

        int pkr5000, pkr1000, pkr500, pkr100, pkr1;

        pkr5000 = amount/5000;
        amount -= pkr5000 * 5000;
        pkr1000 = amount/1000;
        amount -= pkr1000 * 1000;
        pkr500 = amount/500;
        amount -= pkr500 * 500;
        pkr100 = amount/100;
        amount -= pkr100 * 100;
        pkr1 = amount;

        System.out.println("5000: " + pkr5000 + "\n1000: " + pkr1000 + "\n500: " + pkr500 + "\n100: " + pkr100 + "\n1: " + pkr1);
    }
}
