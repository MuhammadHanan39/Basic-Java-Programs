import java.util.*;
public class Fact{
public static void main(String args[]){
int num;
System.out.println("Enter the num to find the factorial");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
int fact=1;
for(int i=1;i<=num;i++)
fact=fact*i;
System.out.println("Factorial of number is "+fact);
}
}