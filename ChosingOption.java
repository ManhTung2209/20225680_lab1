import javax.swing.JOptionPane;
public class ChosingOption {

   public static void main(String[] args){
	   int otpion = JOptionPane.showConfirmDialog(null,"Do  you want to change the first class ticket?" );
	   JOptionPane.showMessageDialog(null,"You 've chosen "+(otpion == JOptionPane.YES_OPTION? "Yes":"No"));
	   System.exit(0);
   }
}