package week4;

import java.util.Scanner;

public class ConditionProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int year = input.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("leap year");


		}
		else {
			System.out.println("common year");
		}
		
		}
	}


