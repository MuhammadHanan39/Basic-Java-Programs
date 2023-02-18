import javax.swing.JOptionPane;
public class Dialog{
public static void main(String args[]){
float length,width;
String input;
input= JOptionPane.showInputDialog("Enter the length");
length= Integer.parseInt(input);
input=JOptionPane.showInputDialog("Enter the width");
width=Integer.parseInt(input);
float area=length*width;
JOptionPane.showMessageDialog(null,"Area of Rectangle is "+area);
}
}