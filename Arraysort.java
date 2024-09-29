import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Arraysort {
	public static double tinhtong(double[] array){
		double sum = 0;
		for(double num : array){
			sum +=num;
		}
    return sum;
	}
	public static double trungbinh(double[] array){
		double sum = tinhtong(array);
		return(double) sum / array.length;
	}
	public static void main (String[] args){
		Locale.setDefault(Locale.US);
		try (Scanner keyboard = new Scanner(System.in)) {
			System.out.println("Nhap so luong phan tu trong day");
			
			int size = keyboard.nextInt();
			double[] array = new double[size];
			System.out.println("Nhap day so");
			for(int i =0; i<size;i++){
				array[i]=keyboard.nextDouble();
			}
			
			Arrays.sort(array);
			double sum = tinhtong(array);
			double avr = trungbinh(array);
			
			System.out.println("Sap xep day: "+Arrays.toString(array));
			System.out.println("Tong cua day so la: "+ sum);
			System.out.println("Trung binh cua day la: "+ avr);
		}
	}
    
}