class Student{
int x,y;
int sum(){
    return sum();
}}
class test{
    public static void main(String[] args) {
	// write your code here
        Student ab=new Student();
        Student c=new Student();
        ab.x=10;
        ab.y=20;
        c.x=1;
        c.y=2;
        System.out.println(ab.sum());
        ab=c;
        System.out.println(ab.sum());
    }
}
