package week5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		for(int a = 1 ; a <= x ; a++) {
			for(int b = 1 ; b <= a ; b++) {
				System.out.print(" ");
			}
			for(int b = 1 ; b <= (x-a+1)*2-1 ; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
