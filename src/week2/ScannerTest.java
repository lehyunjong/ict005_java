package week2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int x;
		System.out.println("첫번째 숫자를 입력하시오: ");
		x=input.nextInt();
		
		int y;
		System.out.println("두번쨰 숫자를 입력하시오: ");
		y = input.nextInt();
		
		int sum;
		sum = x + y; 
		System.out.println(sum);
	}

}
