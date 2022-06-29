package week4;

import java.util.Scanner;

public class LoopPracticeProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("");
		int x = input.nextInt(); // 0 < x <= 100
		int y = 1;
		int sum = 0;
		while(y<=x) {
			sum = sum + y;
			y++;
		}
		System.out.println(sum);
	}

}
