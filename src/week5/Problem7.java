package week5;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		for(int i = 0 ; i < a ; i++) {
			int b= 1;
			for(int j = 0 ; j < a-1-i ; j++) {
				System.out.print("  ");
			}
			for(int j =0 ; j< i+1 ; j++) {
				System.out.print(b++ +" ");
			}
			System.out.println();
		}
	}

}
