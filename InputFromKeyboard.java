import java.util.Scanner;
public class InputFromKeyboard {
    	public static void main(String[] args){
    		
    		try (Scanner keyboard = new Scanner(System.in)) {
				System.out.println("What's your name");
      
				String strName = keyboard.nextLine();
				System.out.println("How old are you?");
      
				int iold = keyboard.nextInt();
				System.out.println("How many your weights");
				
				double dHeight = keyboard.nextDouble();
				System.out.println("Mrs/Ms. " + strName + ","+" years old. "+iold+ "your height is "+ dHeight+ ".");
			}
    	}
}