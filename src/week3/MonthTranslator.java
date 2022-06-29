package week3;
import java.util.Scanner;
public class MonthTranslator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String month;
		
		System.out.println("월의 이름을 입력하시오: ");
		month = input.nextLine();
		
		int monthnumber;
		switch (month) {
		case "january":
			monthnumber = 1;
			break;
		case "february":
			monthnumber = 2;
			break;
		case "march":
			monthnumber = 3;
			break;
		case "april":
			monthnumber = 4;
			break;
		case "may":
			monthnumber = 5;
			break;
		case "june":
			monthnumber = 6;
			break;
		case "july":
			monthnumber = 7;
			break;
		case "august":
			monthnumber = 8;
			break;
		case "september":
			monthnumber = 9;
			break;
		case "october":
			monthnumber = 10;
			break;
		case "november":
			monthnumber = 11;
			break;
		case "december":
			monthnumber = 12;
			break;
			default:
				monthnumber = 0;
				break;
			
			
			
		
		}
		System.out.println(monthnumber);
			
		
		
		
	}

}
