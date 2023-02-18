import java.util.Scanner;
public class Acc{
public static void main(String arg[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the final velocity");
float v2=input.nextFloat();
System.out.println("Enter the initial velocity");
float v1=input.nextFloat();
System.out.println("Enter the time");
float t=input.nextFloat();
float a=(v2-v1)/t;
System.out.println("Acceleration of body is : "+a);
}
}