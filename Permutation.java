public class Permutation{
public static void perm(String str,String permut){
if(str.length()==0){
System.out.println(permut);
return ;}
for(int i=0;i<str.length();i++){
char ch=str.charAt(i);
String newstr=str.subString(0,i) + str.subString(i+1);
perm(newstr,permut+ch);}
}

public static void main(String arg[]){
Permutation result=new Permutation();
//String str="abc";
//result.perm("abc"," ");
perm("abc","");
}
}