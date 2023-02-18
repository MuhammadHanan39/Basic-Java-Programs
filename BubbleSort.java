import java.util.*;
public class BubbleSort{
public static void main(String args[]){
System.out.println("Enter the value of array");
Scanner sc = new Scanner(System.in);
int num= sc.nextInt[];
int array[]=new int[num];
System.out.println("Enter the values ");
array=sc.nextInt();
for(int i=0;i<num-1;i++){
for(int j=i;j<num-1-i;j++){
if(array[j]>array[j+1]){
int temp =array[j];
array[j]=array[j+1];
array[j+1]=temp;}
System.out.print(array[j]+"  ");
}
}
}
}