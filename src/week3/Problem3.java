package week3;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		int sum;
		x = x++;
		System.out.print(x+1);
		y = --y;
		sum = x*y;
		System.out.print(" "+y);
		System.out.print(" "+sum);
		
		
	}

}
