import javax.swing.JOptionPane;
public class Jop{
public static void main(String args[]){
String A=JOptionPane.showInputDialog("Enter the length of rectangle : ");
int length=Integer.parseInt(A);
String B=JOptionPane.showInputDialog("Enter the width of rectangle : ");
int width=Integer.parseInt(B);
int Area=length*width;
JOptionPane.showMessageDialog(null,"Area of rectangle is : "+Area);
}
}
