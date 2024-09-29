
import javax.swing.JOptionPane;

public class ChoseYesNo {
    public static void main(String[] args) {
        
        String[] options = {"Yes", "No"};

        int choice = JOptionPane.showOptionDialog(null, 
            "Do you want to continue?",  
            "User Choice",               
            JOptionPane.YES_NO_OPTION,    
            JOptionPane.QUESTION_MESSAGE, 
            null,                        
            options,                      
            options[0]);                  

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose: Yes", "Result", JOptionPane.INFORMATION_MESSAGE);
        } else if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose: No", "Result", JOptionPane.INFORMATION_MESSAGE);
        } 
    }
}