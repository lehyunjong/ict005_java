package week5;

import java.util.Scanner;

public class Problem3 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int x;
	int y;
	x = input.nextInt();
	y = input.nextInt();
	for(int a = 1 ; a <= x ; a++) {
		for(int b = 1 ; b <= y ; b++) {
			System.out.print(a*b +" ");
		}
		System.out.println("");
		
	}
}
}
