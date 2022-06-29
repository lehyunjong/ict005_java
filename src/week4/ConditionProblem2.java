package week4;

import java.util.Scanner;

public class ConditionProblem2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String x = input.nextLine();
		
		switch(x) {
		case "A":
		System.out.println("Excellent");
		break;
		case "B":
		System.out.println("Good");
		break;
		case "C":
		System.out.println("Usually");
		break;
		case "D":
		System.out.println("Effort");
		break;
		case "F":
		System.out.println("Failure");
		break;
		default:
		System.out.println("error");
		break;
		
		}
		
	}

}
