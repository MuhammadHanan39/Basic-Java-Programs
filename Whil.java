import java.util.Scanner;
public class Whil{
public static void main(String args[]){
System.out.println("Enter the number to find its factorial");
Scanner input=new Scanner(System.in);
int num=input.nextInt();
int fact=num;
do{
num--;
fact=fact*num;
System.out.println("Factorial of a number is : "+fact);
}while(num>1);

}
}