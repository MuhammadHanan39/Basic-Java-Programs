import java.util.Scanner;
public class Read{
public static void main(String args[]){
Scanner data=new Scanner(System.in);
int age;
float value;
String name;
char gender;
System.out.println("Enter the age");
age=data.nextInt();
System.out.println("Enter the floating value");
value=data.nextFloat();
System.out.println("Enter the name");
name=data.next();
System.out.println("Enter the gender \"M\" or \"F\"");
gender= data.next().charAt(0);
System.out.println(" age is : "+age);
System.out.println(" floating value is : "+value);
System.out.println(" name is : "+name);
System.out.println(" Gender is : "+gender);
System.exit(0);
}
} 