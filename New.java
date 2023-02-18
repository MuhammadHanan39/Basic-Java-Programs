import javax.swing.JOptionPane;
public class New{
public static void main(String args[]){
int length,width;
String input;
input= JOptionPane.showInputDialog("Enter the length");
length= Integer.parseInt(input);
input=JOptionPane.showInputDialog("Enter the width");
width=Integer.parseInt(input);
int area=length*width;
JOptionPane.showMessageDialog(null,"Area of Rectangle is "+area);
}
}