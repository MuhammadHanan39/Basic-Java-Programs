import java.util.Scanner;
public class Fact3{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number to find its factorial ");
int a=input.nextInt();
int fact=a;
for(int i=a-1;i>=1;i--)
fact=fact*i;
System.out.println("the factorial of the number is : "+fact);
}
}
