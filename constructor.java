class Constructor{
    int a,b;
    Constructor(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a+" "+b);
    }
    Constructor(){
        System.out.println(this.a=a+" "+b);

    }
    void display2(){
        System.out.println("Hanan shaikh"+a+b);
    }
}
class main{
    public static void main(String arg[]){
    Constructor obj=new Constructor(5,6);
    Constructor obj2= new Constructor();
    obj.display();
    obj2.display2();
    }
}