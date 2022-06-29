package week4;

import java.util.Scanner;

public class LoopPracticeProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int sum = 0;
		while(x<=100) {
			sum = sum + x;
			x = x+1;
		}
		System.out.println(sum);
	}

}
