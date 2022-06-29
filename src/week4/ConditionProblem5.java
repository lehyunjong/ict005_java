package week4;

import java.util.Scanner;

public class ConditionProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("");
		String x = input.nextLine();
		String F,M;
		System.out.print("");
		int y = input.nextInt();
		switch(x) {
		case "M":
			if(y>=18) {
				System.out.println("MAN");
			}
			else {
				System.out.println("BOY");
			}
		break;
		case "F":
			if(y>=18) {
				System.out.println("WOMAN");
			}
			else {
				System.out.println("GIRL");
			}
			break;
			default:
				System.out.println("");
				break;
		}
	}

}
