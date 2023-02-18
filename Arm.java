import java.util.Scanner;
public class Arm{
public static void main(String a[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number");
int num=input.nextInt();
int num1=num;
int sum=0;
while(num!=0){
int rem=num%10;
int power=(int) Math.pow(rem,3);
sum+=power;
num=num/10;
}
if(num1==sum)
System.out.println("num is Armstrong");
else
System.out.println("num is not Armstrong");
}
}