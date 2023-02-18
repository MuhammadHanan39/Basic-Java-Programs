import java.util.Scanner;
public class Fibonic{
public static void main(String args[]){
System.out.println("Enter the number of fibonacci series");
Scanner input=new Scanner(System.in);
int num=input.nextInt();
int a=0,b=1;
System.out.print("Fibonacci series is : "+a+" "+b+" ");
for(int i=1;i<num-1;i++){
int c=a+b;
a=b;
b=c;
System.out.print(c+" ");
}
}
}