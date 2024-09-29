import java.util.Scanner;
import java.util.Locale;
public class MatrixAddition {
	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        int cols = scanner.nextInt();

        double[][] matrix1 = new double[rows][cols];
        double[][] matrix2 = new double[rows][cols];
        double[][] result = new double[rows][cols];
    
        System.out.println("Nhap cac phan tu cua ma tran 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "] : ");
                matrix1[i][j] = scanner.nextDouble();
            }
        }
    
        System.out.println("Nhap cac phan tu cua ma tran 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phan tu [" + i + "][" + j + "] : ");
                matrix2[i][j] = scanner.nextDouble();
            }
        }
 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Ma tran ket qua:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
   	}
}
