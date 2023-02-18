class Random{
public static void main(String arg[]){
//Program which display the random number from the range 200 to 400
int min=200;
int max=400;
double random=Math.random()*(max-min+1)+min;
int random1=(int)random; 
System.out.println(random1);
}
}
