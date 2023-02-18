import java.util.Scanner;
public class Coins{
public static void main(String arg[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter the amount : ");
int i=input.nextInt();
//System.out.print("5000 notes are : "+i/5000+"\n500 notes are : "+(i%5000)/500+"\n100 notes are : "+(i%5500)/100+"\ncoins are : "+i%55000);
int n1=i/5000;
int n2=(i%(5000*n1))/500;
int n3=(i%(5000*n1+500*n2))/100;
int n4=(i%(5000*n1+500*n2+100*n3));
System.out.println("5000 notes are : "+n1+"\n500 notes are : "+n2+"\n100 notes are : "+n3+"\nremaining coins are : "+n4);
}
}
