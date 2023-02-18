import javax.swing.JOptionPane;
public class JopLoop{
public static void main(String args[]){
String number=JOptionPane.showInputDialog("Enter the number to find its factorial");
int num=Integer.parseInt(number);
int fact=num;
for(int i=num-1;i>1;i--){
fact=fact*i;}
JOptionPane.showMessageDialog(null,"Factorial of number is "+fact);
}
}
