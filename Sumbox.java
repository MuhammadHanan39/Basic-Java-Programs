import javax.swing.JOptionPane;
public class Sumbox{
public static void main(String args[]){
int a,b;
String value;
value=JOptionPane.showInputDialog("Enter first variable");
a=Integer.parseInt(value);
value=JOptionPane.showInputDialog("Enter second variable");
b=Integer.parseInt(value);
int sum=a+b;
JOptionPane.showMessageDialog(null,"Sum of variables are "+sum);
}
}