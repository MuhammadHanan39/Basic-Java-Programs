class My{
public int sum1(int a,int b){
int sum=a+b;
return sum;}
}
public class SumFunction{
public static int sum(int a,int b){
int sum=a+b;
return sum;
}
public static void main(String args[]){
My s=new My();
System.out.println(s.sum1(5,4));
}
}