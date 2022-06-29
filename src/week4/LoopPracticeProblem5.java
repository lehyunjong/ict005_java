package week4;

import java.util.Scanner;

public class LoopPracticeProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int y = 0;
		while(true) {
		int x = input.nextInt();
		if(x == 0) 
			break;
		if(x%3 != 0 && x%5 != 0)
			y++;
		}
		System.out.println(y);
		
	}

}
