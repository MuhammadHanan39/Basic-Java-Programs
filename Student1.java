class Student1{
int x,y;
int sum(){
    return sum();
}}
class test{
    public static void main(String[] args) {
	// write your code here
        Student1 ab=new Student1();
        Student1 c=new Student1();
        ab.x=10;
        ab.y=20;
        c.x=1;
        c.y=2;
        System.out.println(ab.sum());
        ab=c;
        System.out.println(ab.sum());
    }
}
