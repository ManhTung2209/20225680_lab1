import java.util.Scanner;
public class MonthDays {
	public static boolean isleapyear(int year){
        if(year % 4 == 0){
            return true;
        }
        else if(year % 100 == 0){
            return false;
        }
        else if(year % 400 == 0){
            return true;
        }
        return false;

    }
    public static int Getday(String month, int year){
        month.toLowerCase();
        boolean leap = isleapyear(year);
        switch (month) {
            case "1": case"jan": case "jan.": case"january":
            return 31;
            case"2": case"february": case"feb": case "feb.":
            return leap ? 29 :28;
            case"3": case"march": case"mar": case"mar.":
            return 31;
            case"4": case"april": case"apr.": case"apr":
            return 30;
            case"5": case"may": case"may.":
            return 31;
            case"6": case"june": case"jun.": case"jun":
            return 30;
            case"7": case"july": case"jul": case"jul.":
            return 31;
            case"8": case"august": case"aug": case"aug.":
            return 31;
            case"9": case"september": case"sep": case"sept.":
            return 30;
            case"10": case"october": case"oct": case"oct.":
            return 31;
            case"11": case"november": case"nov": case"nov.":
            return 30;
            case"12": case"december": case"dec": case"dec.":
            return 31;
            default:
            return -1;    
            
        }

    }
    public static void main (String[] args){
    	Scanner keyboard = new Scanner(System.in);
        String month;
       
        int year;
        while (true) 
        {
            System.out.println("Nhap thang ma ban muon xem ");
            month = keyboard.next();
            System.out.print("Nhap nam ma ban muon xem ");    
        
        while (!keyboard.hasNextInt()) {
            System.out.println("nam nhap da sai vui long nhap lai");
            keyboard.next();
            
        }
        year = keyboard.nextInt();
        if(year <0){
        	System.out.println("Nam khong ton tai, vui long nhap lai ");
        	continue;
        }
    int days = Getday(month,year);
    	if(days == -1){
    		System.out.println("Khong ton tai thang, nhap lai");}
        else{
            System.out.println("Thang "+month+"cua nam "+year+"co " + days);
        break;
        }
    }
    keyboard.close();
    }
}