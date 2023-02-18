class Test{
int x,y;
int sum(){
return x+y;}
Test(){
System.out.println("this is super class constructor");}
}
class Lect36 extends Test{
Lect36(){
super();
}
int z;
int sum(){
return(z+super.sum());
}
public static void main(String arg[]){
 Lect36 a=new Lect36();
a.x=10;a.y=20;
Test b=new Test();
b.x=100;
b.y=200;
System.out.println(b.sum());
}
}