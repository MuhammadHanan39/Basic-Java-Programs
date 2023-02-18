import java.util.Scanner;
public class Hello{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the month number");
int month= input.nextInt();
int year;
if(month==2){
System.out.println("Enter the year ");
year=input.nextInt();
if(year%4==0)
year=1;
else
year=2;
switch(year){
case 1:
System.out.println("this year is leap year and month contain 29 days");
break;
case 2:
System.out.println("month have 28 days");
break;
}
}
switch(month){
case 1,3,5,7,10,12:
System.out.println("month have 31 days");
break;
case 4,6,9,11:
System.out.println("month have 30 days");
break;
}

}
}