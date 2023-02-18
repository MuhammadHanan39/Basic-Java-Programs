import javax.swing.JOptionPane;
public class Dialog{
public static void main(String args[]){
int length,width;
string input;
input= JOptionPane.showInputDialog("Enter the length");
length= integer.parseInt(input);
input=JOptionPane.showInputDialog("Enter the width");
width=integer.parseInt(input);
int area=length*width;
JOptionPane.showMessageDialog(null,"Area of Rectangle is "+area);
}
}