package ex2;
import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog(null, 
            "Choose the type of equation to solve:\n" +
            "1. First-degree equation \n" +
            "2. System of first-degree equations\n" +
            "3. Second-degree equation ",
            "Equation Solver", JOptionPane.INFORMATION_MESSAGE);
        
        int option = Integer.parseInt(choice);

        switch (option) {
            case 1:
                SolveFirstDegreeEquation();
                break;
            case 2:
                SolveSystemOfEquations();
                break;
            case 3:
                SolveSecondDegreeEquation();
                break;
            default:
                JOptionPane.showMessageDialog(null, 
                    "Invalid option!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void SolveFirstDegreeEquation() {
        String aStr = JOptionPane.showInputDialog(null, 
            "Enter coefficient a (a ≠ 0):", "Input", JOptionPane.INFORMATION_MESSAGE);
        String bStr = JOptionPane.showInputDialog(null, 
            "Enter coefficient b:", "Input", JOptionPane.INFORMATION_MESSAGE);
        
        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, 
                "Invalid equation. Coefficient 'a' cannot be 0!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double x = -b / a;
            JOptionPane.showMessageDialog(null, 
                "The solution is: x = " + x, 
                "Solution", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void SolveSystemOfEquations() {
        String a1Str = JOptionPane.showInputDialog(null, 
            "Enter coefficient a1 (for the first equation):", "Input", JOptionPane.INFORMATION_MESSAGE);
        String b1Str = JOptionPane.showInputDialog(null, 
            "Enter coefficient b1 (for the first equation):", "Input", JOptionPane.INFORMATION_MESSAGE);
        String c1Str = JOptionPane.showInputDialog(null, 
            "Enter constant c1 (for the first equation):", "Input", JOptionPane.INFORMATION_MESSAGE);

        String a2Str = JOptionPane.showInputDialog(null, 
            "Enter coefficient a2 (for the second equation):", "Input", JOptionPane.INFORMATION_MESSAGE);
        String b2Str = JOptionPane.showInputDialog(null, 
            "Enter coefficient b2 (for the second equation):", "Input", JOptionPane.INFORMATION_MESSAGE);
        String c2Str = JOptionPane.showInputDialog(null, 
            "Enter constant c2 (for the second equation):", "Input", JOptionPane.INFORMATION_MESSAGE);

        double a1 = Double.parseDouble(a1Str);
        double b1 = Double.parseDouble(b1Str);
        double c1 = Double.parseDouble(c1Str);
        double a2 = Double.parseDouble(a2Str);
        double b2 = Double.parseDouble(b2Str);
        double c2 = Double.parseDouble(c2Str);

        double D = a1 * b2 - a2 * b1;

        if (D == 0) {
            JOptionPane.showMessageDialog(null, 
                "The system has no unique solution ", 
                "No Solution", JOptionPane.INFORMATION_MESSAGE);
        } else {
            double x = (c1 * b2 - c2 * b1) / D;
            double y = (a1 * c2 - a2 * c1) / D;
            JOptionPane.showMessageDialog(null, 
                "The solution is: x = " + x + ", y = " + y, 
                "Solution", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void SolveSecondDegreeEquation() {
        String aStr = JOptionPane.showInputDialog(null, 
            "Enter coefficient a:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String bStr = JOptionPane.showInputDialog(null, 
            "Enter coefficient b:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String cStr = JOptionPane.showInputDialog(null, 
            "Enter coefficient c:", "Input", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double c = Double.parseDouble(cStr);

        if (a == 0) {
            JOptionPane.showMessageDialog(null, 
                "Invalid equation", 
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            double Delta = b * b - 4 * a * c;
            if (Delta > 0) {
                double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "The solutions are: x1 = " + x1 + ", x2 = " + x2, 
                    "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else if (Delta == 0) {
                double x = -b / (2 * a);
                JOptionPane.showMessageDialog(null, 
                    "The solution is: x = " + x, 
                    "Solution", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, 
                    "The equation has no real solutions.", 
                    "No Real Solution", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

