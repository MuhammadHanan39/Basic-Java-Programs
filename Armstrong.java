import java.util.*;
public class Armstrong{
public static void main(String args[]){
int num,rem,power;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your num");
num=sc.nextInt();
int temp=num;
while(num!=0){
rem=num%10;
power=(int)Math.pow(rem,3);
sum=sum+power;
num=num/10;
}
if(sum==temp)
System.out.println("Number is Armstrong num ");
else
System.out.println("Number is not Armstrong num  ");
}
}
