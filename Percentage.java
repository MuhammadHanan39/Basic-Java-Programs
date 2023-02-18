import java.util.*;
public class Percentage{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter first marks");
float a=sc.nextInt();
System.out.println("enter second marks");
float b=sc.nextInt();
System.out.println("enter third marks");
float c=sc.nextInt();
System.out.println("enter the third marks");
float d=sc.nextInt();
float per=((a+b+c+d)/400)*100;
System.out.println(per);
}
}