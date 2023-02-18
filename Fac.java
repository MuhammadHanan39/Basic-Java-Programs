import java.util.Scanner;
class Fac{
public static void main(String arg[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number to find its factorial");
int num=input.nextInt();
//int num1=num;
for(int i=num-1;i>0;i--)
num=num*i;
System.out.println("Factorial of the number is :" +num);
}
 }