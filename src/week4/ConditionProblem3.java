package week4;

import java.util.Scanner;

public class ConditionProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Number? ");
		int animal = input.nextInt();
		
		switch(animal) {
		case 1:
			System.out.println("dog");
			break;
		case 2:
			System.out.println("cat");
			break;
		case 3:
			System.out.println("chick");
			break;
			default:
				System.out.println("I don't know.");
				break;
		}
		
			
	}

}
