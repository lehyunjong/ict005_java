package week2;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		int x;
		System.out.println("ù��° ���ڸ� �Է��Ͻÿ�: ");
		x=input.nextInt();
		
		int y;
		System.out.println("�ι��� ���ڸ� �Է��Ͻÿ�: ");
		y = input.nextInt();
		
		int sum;
		sum = x + y; 
		System.out.println(sum);
	}

}
