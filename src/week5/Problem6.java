package week5;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int a = 0;
		int b;
		while(true) {
			a++;
			b = x * a;
			System.out.print(b+" ");
			if(b%10 == 0) {
				break;
			}
			
			
			
		}
	}

}
