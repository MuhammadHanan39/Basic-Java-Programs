import java.util.Scanner;
class Avg{
void initialize(Scanner input,int array[]){
for(int i=0;i<array.length;i++){
array[i]=input.nextInt();}
}

float average(int array[]){
float result=0;
for(i nt i=0;i<6;i++){
result=result+array[i];
}
return(result/array.length);
}

public static void main (String arg[]){
int array[]=new int[6];
Scanner input=new Scanner(System.in);
Avg obj=new Avg();
obj.initialize(input,array);
float result=obj.average(array);
System.out.println("Average is :"+result);
}
}
