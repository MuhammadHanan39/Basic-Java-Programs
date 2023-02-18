import java.util.Scanner;
class Prime{
public static void main(String arg[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the number, so program should display whether it is prime or not");
int num=input.nextInt();
boolean check=true;
if(num==2){
System.out.println("number is prime");}
else if(num%2==0)
System.out.println("number is not prime");
else if(num==3){
System.out.println("number is prime");}
else{
for(int i=3;i<num;i+=2){
if((num%i)==0){
check=false;
break;}}
if(check)
System.out.println("number is prime");
else
System.out.println("number is not prime");
}
}
}


