package week3;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(); 
		int b = input.nextInt();
		int c = input.nextInt(); 
		int d = input.nextInt();
		if(a > c && b > d) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

}
