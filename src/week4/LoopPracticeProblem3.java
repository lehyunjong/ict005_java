package week4;

import java.util.Scanner;

public class LoopPracticeProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int x = input.nextInt();
		int y = 1;
		int z;
		while(y<=10) {
			z = x*y;
			y++;
			System.out.print(z+" ");
		}

		
	}

}
