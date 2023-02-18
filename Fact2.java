import java.util.*;
public class Fact2{
public static void main(String args[]){
int num;
int fact=1;
System.out.println("Enter the number to find factorial");
Scanner sc=new Scanner(System.in);
num =sc.nextInt();
do{
fact=fact*num;
num--;}
while(num!=0);
System.out.println("factorial of number is "+fact);
}
}